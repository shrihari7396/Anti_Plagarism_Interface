package edu.pict.questionmangement.service;

import edu.pict.TestCaseRequest;
import edu.pict.TestCaseResponse;
import edu.pict.TestCaseServiceGrpc;
import edu.pict.TestCases;
import edu.pict.questionmangement.dto.TestCasesDto;
import edu.pict.questionmangement.dto.TestcaseDto;
import edu.pict.questionmangement.mapper.TestCaseMapper;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Service implementation for handling test case operations through gRPC.
 */
@Service
public class TestCaseServiceImpl {

    /**
     * gRPC client stub to communicate with the TestCaseService server.
     */
    @GrpcClient("TestCaseService")
    private TestCaseServiceGrpc.TestCaseServiceBlockingStub testCaseServiceBlockingStub;

    /**
     * Stores a list of test cases by converting the DTOs to gRPC-compatible Protobuf messages,
     * calling the remote gRPC `storeTestCases` function, and mapping the response back to DTOs.
     *
     * @param testCasesDto A DTO containing a list of test cases to be stored.
     * @return A list of stored test cases in DTO format as returned by the gRPC service.
     */
    public List<TestcaseDto> storeTestCases(TestCasesDto testCasesDto) {

        // Convert DTOs to gRPC Testcase Protobuf messages
        TestCases testCases = TestCases.newBuilder()
                .addAllTestcases(
                        testCasesDto.getTestcases().stream()
                                .map(TestCaseMapper::testCaseDtoToTestcase)
                                .toList() // Use .collect(Collectors.toList()) if Java <16
                )
                .build();

        // Send the test cases to the gRPC service and receive the stored cases
        TestCases storedTestCases = testCaseServiceBlockingStub.storeTestCases(testCases);

        // Convert the gRPC response back to DTOs and return
        return storedTestCases.getTestcasesList().stream()
                .map(TestCaseMapper::testCaseToTestcaseDto)
                .toList(); // Use .collect(Collectors.toList()) if Java <16
    }

    /**
     * Retrieves all test cases associated with a specific question ID from the gRPC service.
     *
     * @param questionId UUID of the question whose test cases are to be fetched.
     * @return A DTO containing all test cases linked to the given question ID.
     */
    public TestCasesDto getTestCasesByQuestionId(UUID questionId) {

        // Build the gRPC request with the question ID
        TestCaseRequest request = TestCaseRequest.newBuilder()
                .setQuestionId(questionId.toString())
                .build();

        // Call the gRPC service to get the test cases
        TestCaseResponse response = testCaseServiceBlockingStub.getTestCasesByQuestionId(request);

        // Convert the gRPC response to a DTO and return
        return TestCaseMapper.TestCaseResponseToTestCasesResponseDto(response);
    }
}
