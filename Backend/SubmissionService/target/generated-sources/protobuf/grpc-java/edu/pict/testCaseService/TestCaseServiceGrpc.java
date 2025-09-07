package edu.pict.testCaseService;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class TestCaseServiceGrpc {

  private TestCaseServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "TestCaseService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<edu.pict.testCaseService.TestCases,
      edu.pict.testCaseService.TestCases> getStoreTestCasesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "storeTestCases",
      requestType = edu.pict.testCaseService.TestCases.class,
      responseType = edu.pict.testCaseService.TestCases.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edu.pict.testCaseService.TestCases,
      edu.pict.testCaseService.TestCases> getStoreTestCasesMethod() {
    io.grpc.MethodDescriptor<edu.pict.testCaseService.TestCases, edu.pict.testCaseService.TestCases> getStoreTestCasesMethod;
    if ((getStoreTestCasesMethod = TestCaseServiceGrpc.getStoreTestCasesMethod) == null) {
      synchronized (TestCaseServiceGrpc.class) {
        if ((getStoreTestCasesMethod = TestCaseServiceGrpc.getStoreTestCasesMethod) == null) {
          TestCaseServiceGrpc.getStoreTestCasesMethod = getStoreTestCasesMethod =
              io.grpc.MethodDescriptor.<edu.pict.testCaseService.TestCases, edu.pict.testCaseService.TestCases>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "storeTestCases"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.pict.testCaseService.TestCases.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.pict.testCaseService.TestCases.getDefaultInstance()))
              .setSchemaDescriptor(new TestCaseServiceMethodDescriptorSupplier("storeTestCases"))
              .build();
        }
      }
    }
    return getStoreTestCasesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<edu.pict.testCaseService.TestCaseRequest,
      edu.pict.testCaseService.TestCaseResponse> getGetTestCasesByQuestionIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTestCasesByQuestionId",
      requestType = edu.pict.testCaseService.TestCaseRequest.class,
      responseType = edu.pict.testCaseService.TestCaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edu.pict.testCaseService.TestCaseRequest,
      edu.pict.testCaseService.TestCaseResponse> getGetTestCasesByQuestionIdMethod() {
    io.grpc.MethodDescriptor<edu.pict.testCaseService.TestCaseRequest, edu.pict.testCaseService.TestCaseResponse> getGetTestCasesByQuestionIdMethod;
    if ((getGetTestCasesByQuestionIdMethod = TestCaseServiceGrpc.getGetTestCasesByQuestionIdMethod) == null) {
      synchronized (TestCaseServiceGrpc.class) {
        if ((getGetTestCasesByQuestionIdMethod = TestCaseServiceGrpc.getGetTestCasesByQuestionIdMethod) == null) {
          TestCaseServiceGrpc.getGetTestCasesByQuestionIdMethod = getGetTestCasesByQuestionIdMethod =
              io.grpc.MethodDescriptor.<edu.pict.testCaseService.TestCaseRequest, edu.pict.testCaseService.TestCaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getTestCasesByQuestionId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.pict.testCaseService.TestCaseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.pict.testCaseService.TestCaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TestCaseServiceMethodDescriptorSupplier("getTestCasesByQuestionId"))
              .build();
        }
      }
    }
    return getGetTestCasesByQuestionIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<edu.pict.testCaseService.TestCaseRequest,
      edu.pict.testCaseService.TestCaseResponse> getGetVisibleTestCasesByQuestionIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getVisibleTestCasesByQuestionId",
      requestType = edu.pict.testCaseService.TestCaseRequest.class,
      responseType = edu.pict.testCaseService.TestCaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edu.pict.testCaseService.TestCaseRequest,
      edu.pict.testCaseService.TestCaseResponse> getGetVisibleTestCasesByQuestionIdMethod() {
    io.grpc.MethodDescriptor<edu.pict.testCaseService.TestCaseRequest, edu.pict.testCaseService.TestCaseResponse> getGetVisibleTestCasesByQuestionIdMethod;
    if ((getGetVisibleTestCasesByQuestionIdMethod = TestCaseServiceGrpc.getGetVisibleTestCasesByQuestionIdMethod) == null) {
      synchronized (TestCaseServiceGrpc.class) {
        if ((getGetVisibleTestCasesByQuestionIdMethod = TestCaseServiceGrpc.getGetVisibleTestCasesByQuestionIdMethod) == null) {
          TestCaseServiceGrpc.getGetVisibleTestCasesByQuestionIdMethod = getGetVisibleTestCasesByQuestionIdMethod =
              io.grpc.MethodDescriptor.<edu.pict.testCaseService.TestCaseRequest, edu.pict.testCaseService.TestCaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getVisibleTestCasesByQuestionId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.pict.testCaseService.TestCaseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.pict.testCaseService.TestCaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TestCaseServiceMethodDescriptorSupplier("getVisibleTestCasesByQuestionId"))
              .build();
        }
      }
    }
    return getGetVisibleTestCasesByQuestionIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<edu.pict.testCaseService.DeleteTestCaseRequest,
      edu.pict.testCaseService.DeleteTestCaseResponse> getDeleteTestCasesByQuestionIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteTestCasesByQuestionID",
      requestType = edu.pict.testCaseService.DeleteTestCaseRequest.class,
      responseType = edu.pict.testCaseService.DeleteTestCaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edu.pict.testCaseService.DeleteTestCaseRequest,
      edu.pict.testCaseService.DeleteTestCaseResponse> getDeleteTestCasesByQuestionIDMethod() {
    io.grpc.MethodDescriptor<edu.pict.testCaseService.DeleteTestCaseRequest, edu.pict.testCaseService.DeleteTestCaseResponse> getDeleteTestCasesByQuestionIDMethod;
    if ((getDeleteTestCasesByQuestionIDMethod = TestCaseServiceGrpc.getDeleteTestCasesByQuestionIDMethod) == null) {
      synchronized (TestCaseServiceGrpc.class) {
        if ((getDeleteTestCasesByQuestionIDMethod = TestCaseServiceGrpc.getDeleteTestCasesByQuestionIDMethod) == null) {
          TestCaseServiceGrpc.getDeleteTestCasesByQuestionIDMethod = getDeleteTestCasesByQuestionIDMethod =
              io.grpc.MethodDescriptor.<edu.pict.testCaseService.DeleteTestCaseRequest, edu.pict.testCaseService.DeleteTestCaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteTestCasesByQuestionID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.pict.testCaseService.DeleteTestCaseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.pict.testCaseService.DeleteTestCaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TestCaseServiceMethodDescriptorSupplier("deleteTestCasesByQuestionID"))
              .build();
        }
      }
    }
    return getDeleteTestCasesByQuestionIDMethod;
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
    default void storeTestCases(edu.pict.testCaseService.TestCases request,
        io.grpc.stub.StreamObserver<edu.pict.testCaseService.TestCases> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStoreTestCasesMethod(), responseObserver);
    }

    /**
     */
    default void getTestCasesByQuestionId(edu.pict.testCaseService.TestCaseRequest request,
        io.grpc.stub.StreamObserver<edu.pict.testCaseService.TestCaseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTestCasesByQuestionIdMethod(), responseObserver);
    }

    /**
     */
    default void getVisibleTestCasesByQuestionId(edu.pict.testCaseService.TestCaseRequest request,
        io.grpc.stub.StreamObserver<edu.pict.testCaseService.TestCaseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetVisibleTestCasesByQuestionIdMethod(), responseObserver);
    }

    /**
     */
    default void deleteTestCasesByQuestionID(edu.pict.testCaseService.DeleteTestCaseRequest request,
        io.grpc.stub.StreamObserver<edu.pict.testCaseService.DeleteTestCaseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteTestCasesByQuestionIDMethod(), responseObserver);
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
    public void storeTestCases(edu.pict.testCaseService.TestCases request,
        io.grpc.stub.StreamObserver<edu.pict.testCaseService.TestCases> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStoreTestCasesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTestCasesByQuestionId(edu.pict.testCaseService.TestCaseRequest request,
        io.grpc.stub.StreamObserver<edu.pict.testCaseService.TestCaseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTestCasesByQuestionIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getVisibleTestCasesByQuestionId(edu.pict.testCaseService.TestCaseRequest request,
        io.grpc.stub.StreamObserver<edu.pict.testCaseService.TestCaseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetVisibleTestCasesByQuestionIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteTestCasesByQuestionID(edu.pict.testCaseService.DeleteTestCaseRequest request,
        io.grpc.stub.StreamObserver<edu.pict.testCaseService.DeleteTestCaseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteTestCasesByQuestionIDMethod(), getCallOptions()), request, responseObserver);
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
    public edu.pict.testCaseService.TestCases storeTestCases(edu.pict.testCaseService.TestCases request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStoreTestCasesMethod(), getCallOptions(), request);
    }

    /**
     */
    public edu.pict.testCaseService.TestCaseResponse getTestCasesByQuestionId(edu.pict.testCaseService.TestCaseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTestCasesByQuestionIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public edu.pict.testCaseService.TestCaseResponse getVisibleTestCasesByQuestionId(edu.pict.testCaseService.TestCaseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetVisibleTestCasesByQuestionIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public edu.pict.testCaseService.DeleteTestCaseResponse deleteTestCasesByQuestionID(edu.pict.testCaseService.DeleteTestCaseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteTestCasesByQuestionIDMethod(), getCallOptions(), request);
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
    public edu.pict.testCaseService.TestCases storeTestCases(edu.pict.testCaseService.TestCases request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStoreTestCasesMethod(), getCallOptions(), request);
    }

    /**
     */
    public edu.pict.testCaseService.TestCaseResponse getTestCasesByQuestionId(edu.pict.testCaseService.TestCaseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTestCasesByQuestionIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public edu.pict.testCaseService.TestCaseResponse getVisibleTestCasesByQuestionId(edu.pict.testCaseService.TestCaseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetVisibleTestCasesByQuestionIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public edu.pict.testCaseService.DeleteTestCaseResponse deleteTestCasesByQuestionID(edu.pict.testCaseService.DeleteTestCaseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteTestCasesByQuestionIDMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<edu.pict.testCaseService.TestCases> storeTestCases(
        edu.pict.testCaseService.TestCases request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStoreTestCasesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<edu.pict.testCaseService.TestCaseResponse> getTestCasesByQuestionId(
        edu.pict.testCaseService.TestCaseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTestCasesByQuestionIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<edu.pict.testCaseService.TestCaseResponse> getVisibleTestCasesByQuestionId(
        edu.pict.testCaseService.TestCaseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetVisibleTestCasesByQuestionIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<edu.pict.testCaseService.DeleteTestCaseResponse> deleteTestCasesByQuestionID(
        edu.pict.testCaseService.DeleteTestCaseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteTestCasesByQuestionIDMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_STORE_TEST_CASES = 0;
  private static final int METHODID_GET_TEST_CASES_BY_QUESTION_ID = 1;
  private static final int METHODID_GET_VISIBLE_TEST_CASES_BY_QUESTION_ID = 2;
  private static final int METHODID_DELETE_TEST_CASES_BY_QUESTION_ID = 3;

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
          serviceImpl.storeTestCases((edu.pict.testCaseService.TestCases) request,
              (io.grpc.stub.StreamObserver<edu.pict.testCaseService.TestCases>) responseObserver);
          break;
        case METHODID_GET_TEST_CASES_BY_QUESTION_ID:
          serviceImpl.getTestCasesByQuestionId((edu.pict.testCaseService.TestCaseRequest) request,
              (io.grpc.stub.StreamObserver<edu.pict.testCaseService.TestCaseResponse>) responseObserver);
          break;
        case METHODID_GET_VISIBLE_TEST_CASES_BY_QUESTION_ID:
          serviceImpl.getVisibleTestCasesByQuestionId((edu.pict.testCaseService.TestCaseRequest) request,
              (io.grpc.stub.StreamObserver<edu.pict.testCaseService.TestCaseResponse>) responseObserver);
          break;
        case METHODID_DELETE_TEST_CASES_BY_QUESTION_ID:
          serviceImpl.deleteTestCasesByQuestionID((edu.pict.testCaseService.DeleteTestCaseRequest) request,
              (io.grpc.stub.StreamObserver<edu.pict.testCaseService.DeleteTestCaseResponse>) responseObserver);
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
              edu.pict.testCaseService.TestCases,
              edu.pict.testCaseService.TestCases>(
                service, METHODID_STORE_TEST_CASES)))
        .addMethod(
          getGetTestCasesByQuestionIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              edu.pict.testCaseService.TestCaseRequest,
              edu.pict.testCaseService.TestCaseResponse>(
                service, METHODID_GET_TEST_CASES_BY_QUESTION_ID)))
        .addMethod(
          getGetVisibleTestCasesByQuestionIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              edu.pict.testCaseService.TestCaseRequest,
              edu.pict.testCaseService.TestCaseResponse>(
                service, METHODID_GET_VISIBLE_TEST_CASES_BY_QUESTION_ID)))
        .addMethod(
          getDeleteTestCasesByQuestionIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              edu.pict.testCaseService.DeleteTestCaseRequest,
              edu.pict.testCaseService.DeleteTestCaseResponse>(
                service, METHODID_DELETE_TEST_CASES_BY_QUESTION_ID)))
        .build();
  }

  private static abstract class TestCaseServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TestCaseServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return edu.pict.testCaseService.TestcaseServiceProto.getDescriptor();
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
              .addMethod(getGetVisibleTestCasesByQuestionIdMethod())
              .addMethod(getDeleteTestCasesByQuestionIDMethod())
              .build();
        }
      }
    }
    return result;
  }
}
