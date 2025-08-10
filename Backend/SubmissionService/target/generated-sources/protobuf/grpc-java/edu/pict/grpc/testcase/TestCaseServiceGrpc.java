package edu.pict.grpc.testcase;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class TestCaseServiceGrpc {

  private TestCaseServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "TestCaseService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<edu.pict.grpc.testcase.TestCases,
      edu.pict.grpc.testcase.TestCases> getStoreTestCasesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "storeTestCases",
      requestType = edu.pict.grpc.testcase.TestCases.class,
      responseType = edu.pict.grpc.testcase.TestCases.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edu.pict.grpc.testcase.TestCases,
      edu.pict.grpc.testcase.TestCases> getStoreTestCasesMethod() {
    io.grpc.MethodDescriptor<edu.pict.grpc.testcase.TestCases, edu.pict.grpc.testcase.TestCases> getStoreTestCasesMethod;
    if ((getStoreTestCasesMethod = TestCaseServiceGrpc.getStoreTestCasesMethod) == null) {
      synchronized (TestCaseServiceGrpc.class) {
        if ((getStoreTestCasesMethod = TestCaseServiceGrpc.getStoreTestCasesMethod) == null) {
          TestCaseServiceGrpc.getStoreTestCasesMethod = getStoreTestCasesMethod =
              io.grpc.MethodDescriptor.<edu.pict.grpc.testcase.TestCases, edu.pict.grpc.testcase.TestCases>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "storeTestCases"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.pict.grpc.testcase.TestCases.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.pict.grpc.testcase.TestCases.getDefaultInstance()))
              .setSchemaDescriptor(new TestCaseServiceMethodDescriptorSupplier("storeTestCases"))
              .build();
        }
      }
    }
    return getStoreTestCasesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<edu.pict.grpc.testcase.TestCaseRequest,
      edu.pict.grpc.testcase.TestCaseResponse> getGetTestCasesByQuestionIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTestCasesByQuestionId",
      requestType = edu.pict.grpc.testcase.TestCaseRequest.class,
      responseType = edu.pict.grpc.testcase.TestCaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edu.pict.grpc.testcase.TestCaseRequest,
      edu.pict.grpc.testcase.TestCaseResponse> getGetTestCasesByQuestionIdMethod() {
    io.grpc.MethodDescriptor<edu.pict.grpc.testcase.TestCaseRequest, edu.pict.grpc.testcase.TestCaseResponse> getGetTestCasesByQuestionIdMethod;
    if ((getGetTestCasesByQuestionIdMethod = TestCaseServiceGrpc.getGetTestCasesByQuestionIdMethod) == null) {
      synchronized (TestCaseServiceGrpc.class) {
        if ((getGetTestCasesByQuestionIdMethod = TestCaseServiceGrpc.getGetTestCasesByQuestionIdMethod) == null) {
          TestCaseServiceGrpc.getGetTestCasesByQuestionIdMethod = getGetTestCasesByQuestionIdMethod =
              io.grpc.MethodDescriptor.<edu.pict.grpc.testcase.TestCaseRequest, edu.pict.grpc.testcase.TestCaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getTestCasesByQuestionId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.pict.grpc.testcase.TestCaseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.pict.grpc.testcase.TestCaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TestCaseServiceMethodDescriptorSupplier("getTestCasesByQuestionId"))
              .build();
        }
      }
    }
    return getGetTestCasesByQuestionIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TestCaseServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TestCaseServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TestCaseServiceStub>() {
        @java.lang.Override
        public TestCaseServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TestCaseServiceStub(channel, callOptions);
        }
      };
    return TestCaseServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static TestCaseServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TestCaseServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TestCaseServiceBlockingV2Stub>() {
        @java.lang.Override
        public TestCaseServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TestCaseServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return TestCaseServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TestCaseServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TestCaseServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TestCaseServiceBlockingStub>() {
        @java.lang.Override
        public TestCaseServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TestCaseServiceBlockingStub(channel, callOptions);
        }
      };
    return TestCaseServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TestCaseServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TestCaseServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TestCaseServiceFutureStub>() {
        @java.lang.Override
        public TestCaseServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TestCaseServiceFutureStub(channel, callOptions);
        }
      };
    return TestCaseServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void storeTestCases(edu.pict.grpc.testcase.TestCases request,
        io.grpc.stub.StreamObserver<edu.pict.grpc.testcase.TestCases> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStoreTestCasesMethod(), responseObserver);
    }

    /**
     */
    default void getTestCasesByQuestionId(edu.pict.grpc.testcase.TestCaseRequest request,
        io.grpc.stub.StreamObserver<edu.pict.grpc.testcase.TestCaseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTestCasesByQuestionIdMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TestCaseService.
   */
  public static abstract class TestCaseServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TestCaseServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TestCaseService.
   */
  public static final class TestCaseServiceStub
      extends io.grpc.stub.AbstractAsyncStub<TestCaseServiceStub> {
    private TestCaseServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestCaseServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TestCaseServiceStub(channel, callOptions);
    }

    /**
     */
    public void storeTestCases(edu.pict.grpc.testcase.TestCases request,
        io.grpc.stub.StreamObserver<edu.pict.grpc.testcase.TestCases> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStoreTestCasesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTestCasesByQuestionId(edu.pict.grpc.testcase.TestCaseRequest request,
        io.grpc.stub.StreamObserver<edu.pict.grpc.testcase.TestCaseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTestCasesByQuestionIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TestCaseService.
   */
  public static final class TestCaseServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<TestCaseServiceBlockingV2Stub> {
    private TestCaseServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestCaseServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TestCaseServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public edu.pict.grpc.testcase.TestCases storeTestCases(edu.pict.grpc.testcase.TestCases request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStoreTestCasesMethod(), getCallOptions(), request);
    }

    /**
     */
    public edu.pict.grpc.testcase.TestCaseResponse getTestCasesByQuestionId(edu.pict.grpc.testcase.TestCaseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTestCasesByQuestionIdMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service TestCaseService.
   */
  public static final class TestCaseServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TestCaseServiceBlockingStub> {
    private TestCaseServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestCaseServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TestCaseServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public edu.pict.grpc.testcase.TestCases storeTestCases(edu.pict.grpc.testcase.TestCases request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStoreTestCasesMethod(), getCallOptions(), request);
    }

    /**
     */
    public edu.pict.grpc.testcase.TestCaseResponse getTestCasesByQuestionId(edu.pict.grpc.testcase.TestCaseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTestCasesByQuestionIdMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TestCaseService.
   */
  public static final class TestCaseServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<TestCaseServiceFutureStub> {
    private TestCaseServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestCaseServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TestCaseServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<edu.pict.grpc.testcase.TestCases> storeTestCases(
        edu.pict.grpc.testcase.TestCases request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStoreTestCasesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<edu.pict.grpc.testcase.TestCaseResponse> getTestCasesByQuestionId(
        edu.pict.grpc.testcase.TestCaseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTestCasesByQuestionIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_STORE_TEST_CASES = 0;
  private static final int METHODID_GET_TEST_CASES_BY_QUESTION_ID = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_STORE_TEST_CASES:
          serviceImpl.storeTestCases((edu.pict.grpc.testcase.TestCases) request,
              (io.grpc.stub.StreamObserver<edu.pict.grpc.testcase.TestCases>) responseObserver);
          break;
        case METHODID_GET_TEST_CASES_BY_QUESTION_ID:
          serviceImpl.getTestCasesByQuestionId((edu.pict.grpc.testcase.TestCaseRequest) request,
              (io.grpc.stub.StreamObserver<edu.pict.grpc.testcase.TestCaseResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getStoreTestCasesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              edu.pict.grpc.testcase.TestCases,
              edu.pict.grpc.testcase.TestCases>(
                service, METHODID_STORE_TEST_CASES)))
        .addMethod(
          getGetTestCasesByQuestionIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              edu.pict.grpc.testcase.TestCaseRequest,
              edu.pict.grpc.testcase.TestCaseResponse>(
                service, METHODID_GET_TEST_CASES_BY_QUESTION_ID)))
        .build();
  }

  private static abstract class TestCaseServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TestCaseServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return edu.pict.grpc.testcase.TestcaseServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TestCaseService");
    }
  }

  private static final class TestCaseServiceFileDescriptorSupplier
      extends TestCaseServiceBaseDescriptorSupplier {
    TestCaseServiceFileDescriptorSupplier() {}
  }

  private static final class TestCaseServiceMethodDescriptorSupplier
      extends TestCaseServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TestCaseServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TestCaseServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TestCaseServiceFileDescriptorSupplier())
              .addMethod(getStoreTestCasesMethod())
              .addMethod(getGetTestCasesByQuestionIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
