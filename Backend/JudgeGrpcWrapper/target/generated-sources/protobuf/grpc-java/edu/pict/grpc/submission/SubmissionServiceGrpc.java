package edu.pict.grpc.submission;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class SubmissionServiceGrpc {

  private SubmissionServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "SubmissionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<edu.pict.grpc.submission.SubmissionRequest,
      edu.pict.grpc.submission.SubmissionResponseToken> getSubmitRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "submitRequest",
      requestType = edu.pict.grpc.submission.SubmissionRequest.class,
      responseType = edu.pict.grpc.submission.SubmissionResponseToken.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edu.pict.grpc.submission.SubmissionRequest,
      edu.pict.grpc.submission.SubmissionResponseToken> getSubmitRequestMethod() {
    io.grpc.MethodDescriptor<edu.pict.grpc.submission.SubmissionRequest, edu.pict.grpc.submission.SubmissionResponseToken> getSubmitRequestMethod;
    if ((getSubmitRequestMethod = SubmissionServiceGrpc.getSubmitRequestMethod) == null) {
      synchronized (SubmissionServiceGrpc.class) {
        if ((getSubmitRequestMethod = SubmissionServiceGrpc.getSubmitRequestMethod) == null) {
          SubmissionServiceGrpc.getSubmitRequestMethod = getSubmitRequestMethod =
              io.grpc.MethodDescriptor.<edu.pict.grpc.submission.SubmissionRequest, edu.pict.grpc.submission.SubmissionResponseToken>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "submitRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.pict.grpc.submission.SubmissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.pict.grpc.submission.SubmissionResponseToken.getDefaultInstance()))
              .setSchemaDescriptor(new SubmissionServiceMethodDescriptorSupplier("submitRequest"))
              .build();
        }
      }
    }
    return getSubmitRequestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<edu.pict.grpc.submission.SubmissionResponseToken,
      edu.pict.grpc.submission.ExecutionResult> getGetResultByExecutionTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getResultByExecutionToken",
      requestType = edu.pict.grpc.submission.SubmissionResponseToken.class,
      responseType = edu.pict.grpc.submission.ExecutionResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edu.pict.grpc.submission.SubmissionResponseToken,
      edu.pict.grpc.submission.ExecutionResult> getGetResultByExecutionTokenMethod() {
    io.grpc.MethodDescriptor<edu.pict.grpc.submission.SubmissionResponseToken, edu.pict.grpc.submission.ExecutionResult> getGetResultByExecutionTokenMethod;
    if ((getGetResultByExecutionTokenMethod = SubmissionServiceGrpc.getGetResultByExecutionTokenMethod) == null) {
      synchronized (SubmissionServiceGrpc.class) {
        if ((getGetResultByExecutionTokenMethod = SubmissionServiceGrpc.getGetResultByExecutionTokenMethod) == null) {
          SubmissionServiceGrpc.getGetResultByExecutionTokenMethod = getGetResultByExecutionTokenMethod =
              io.grpc.MethodDescriptor.<edu.pict.grpc.submission.SubmissionResponseToken, edu.pict.grpc.submission.ExecutionResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getResultByExecutionToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.pict.grpc.submission.SubmissionResponseToken.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.pict.grpc.submission.ExecutionResult.getDefaultInstance()))
              .setSchemaDescriptor(new SubmissionServiceMethodDescriptorSupplier("getResultByExecutionToken"))
              .build();
        }
      }
    }
    return getGetResultByExecutionTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<edu.pict.grpc.submission.SubmissionRequest,
      edu.pict.grpc.submission.ExecutionResult> getInstantExecutionResultMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "instantExecutionResult",
      requestType = edu.pict.grpc.submission.SubmissionRequest.class,
      responseType = edu.pict.grpc.submission.ExecutionResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edu.pict.grpc.submission.SubmissionRequest,
      edu.pict.grpc.submission.ExecutionResult> getInstantExecutionResultMethod() {
    io.grpc.MethodDescriptor<edu.pict.grpc.submission.SubmissionRequest, edu.pict.grpc.submission.ExecutionResult> getInstantExecutionResultMethod;
    if ((getInstantExecutionResultMethod = SubmissionServiceGrpc.getInstantExecutionResultMethod) == null) {
      synchronized (SubmissionServiceGrpc.class) {
        if ((getInstantExecutionResultMethod = SubmissionServiceGrpc.getInstantExecutionResultMethod) == null) {
          SubmissionServiceGrpc.getInstantExecutionResultMethod = getInstantExecutionResultMethod =
              io.grpc.MethodDescriptor.<edu.pict.grpc.submission.SubmissionRequest, edu.pict.grpc.submission.ExecutionResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "instantExecutionResult"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.pict.grpc.submission.SubmissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.pict.grpc.submission.ExecutionResult.getDefaultInstance()))
              .setSchemaDescriptor(new SubmissionServiceMethodDescriptorSupplier("instantExecutionResult"))
              .build();
        }
      }
    }
    return getInstantExecutionResultMethod;
  }

  private static volatile io.grpc.MethodDescriptor<edu.pict.grpc.submission.BatchSubmissionRequest,
      edu.pict.grpc.submission.BatchSubmissionTokens> getSubmitCodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "submitCode",
      requestType = edu.pict.grpc.submission.BatchSubmissionRequest.class,
      responseType = edu.pict.grpc.submission.BatchSubmissionTokens.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edu.pict.grpc.submission.BatchSubmissionRequest,
      edu.pict.grpc.submission.BatchSubmissionTokens> getSubmitCodeMethod() {
    io.grpc.MethodDescriptor<edu.pict.grpc.submission.BatchSubmissionRequest, edu.pict.grpc.submission.BatchSubmissionTokens> getSubmitCodeMethod;
    if ((getSubmitCodeMethod = SubmissionServiceGrpc.getSubmitCodeMethod) == null) {
      synchronized (SubmissionServiceGrpc.class) {
        if ((getSubmitCodeMethod = SubmissionServiceGrpc.getSubmitCodeMethod) == null) {
          SubmissionServiceGrpc.getSubmitCodeMethod = getSubmitCodeMethod =
              io.grpc.MethodDescriptor.<edu.pict.grpc.submission.BatchSubmissionRequest, edu.pict.grpc.submission.BatchSubmissionTokens>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "submitCode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.pict.grpc.submission.BatchSubmissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.pict.grpc.submission.BatchSubmissionTokens.getDefaultInstance()))
              .setSchemaDescriptor(new SubmissionServiceMethodDescriptorSupplier("submitCode"))
              .build();
        }
      }
    }
    return getSubmitCodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<edu.pict.grpc.submission.BatchSubmissionTokens,
      edu.pict.grpc.submission.BatchSubmissionTokensResponse> getGetSubmitCodeResponseFromTokensMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getSubmitCodeResponseFromTokens",
      requestType = edu.pict.grpc.submission.BatchSubmissionTokens.class,
      responseType = edu.pict.grpc.submission.BatchSubmissionTokensResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edu.pict.grpc.submission.BatchSubmissionTokens,
      edu.pict.grpc.submission.BatchSubmissionTokensResponse> getGetSubmitCodeResponseFromTokensMethod() {
    io.grpc.MethodDescriptor<edu.pict.grpc.submission.BatchSubmissionTokens, edu.pict.grpc.submission.BatchSubmissionTokensResponse> getGetSubmitCodeResponseFromTokensMethod;
    if ((getGetSubmitCodeResponseFromTokensMethod = SubmissionServiceGrpc.getGetSubmitCodeResponseFromTokensMethod) == null) {
      synchronized (SubmissionServiceGrpc.class) {
        if ((getGetSubmitCodeResponseFromTokensMethod = SubmissionServiceGrpc.getGetSubmitCodeResponseFromTokensMethod) == null) {
          SubmissionServiceGrpc.getGetSubmitCodeResponseFromTokensMethod = getGetSubmitCodeResponseFromTokensMethod =
              io.grpc.MethodDescriptor.<edu.pict.grpc.submission.BatchSubmissionTokens, edu.pict.grpc.submission.BatchSubmissionTokensResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getSubmitCodeResponseFromTokens"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.pict.grpc.submission.BatchSubmissionTokens.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.pict.grpc.submission.BatchSubmissionTokensResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SubmissionServiceMethodDescriptorSupplier("getSubmitCodeResponseFromTokens"))
              .build();
        }
      }
    }
    return getGetSubmitCodeResponseFromTokensMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SubmissionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SubmissionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SubmissionServiceStub>() {
        @java.lang.Override
        public SubmissionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SubmissionServiceStub(channel, callOptions);
        }
      };
    return SubmissionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static SubmissionServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SubmissionServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SubmissionServiceBlockingV2Stub>() {
        @java.lang.Override
        public SubmissionServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SubmissionServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return SubmissionServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SubmissionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SubmissionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SubmissionServiceBlockingStub>() {
        @java.lang.Override
        public SubmissionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SubmissionServiceBlockingStub(channel, callOptions);
        }
      };
    return SubmissionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SubmissionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SubmissionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SubmissionServiceFutureStub>() {
        @java.lang.Override
        public SubmissionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SubmissionServiceFutureStub(channel, callOptions);
        }
      };
    return SubmissionServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void submitRequest(edu.pict.grpc.submission.SubmissionRequest request,
        io.grpc.stub.StreamObserver<edu.pict.grpc.submission.SubmissionResponseToken> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubmitRequestMethod(), responseObserver);
    }

    /**
     */
    default void getResultByExecutionToken(edu.pict.grpc.submission.SubmissionResponseToken request,
        io.grpc.stub.StreamObserver<edu.pict.grpc.submission.ExecutionResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetResultByExecutionTokenMethod(), responseObserver);
    }

    /**
     */
    default void instantExecutionResult(edu.pict.grpc.submission.SubmissionRequest request,
        io.grpc.stub.StreamObserver<edu.pict.grpc.submission.ExecutionResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInstantExecutionResultMethod(), responseObserver);
    }

    /**
     */
    default void submitCode(edu.pict.grpc.submission.BatchSubmissionRequest request,
        io.grpc.stub.StreamObserver<edu.pict.grpc.submission.BatchSubmissionTokens> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubmitCodeMethod(), responseObserver);
    }

    /**
     */
    default void getSubmitCodeResponseFromTokens(edu.pict.grpc.submission.BatchSubmissionTokens request,
        io.grpc.stub.StreamObserver<edu.pict.grpc.submission.BatchSubmissionTokensResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSubmitCodeResponseFromTokensMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SubmissionService.
   */
  public static abstract class SubmissionServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SubmissionServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SubmissionService.
   */
  public static final class SubmissionServiceStub
      extends io.grpc.stub.AbstractAsyncStub<SubmissionServiceStub> {
    private SubmissionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubmissionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SubmissionServiceStub(channel, callOptions);
    }

    /**
     */
    public void submitRequest(edu.pict.grpc.submission.SubmissionRequest request,
        io.grpc.stub.StreamObserver<edu.pict.grpc.submission.SubmissionResponseToken> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubmitRequestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getResultByExecutionToken(edu.pict.grpc.submission.SubmissionResponseToken request,
        io.grpc.stub.StreamObserver<edu.pict.grpc.submission.ExecutionResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetResultByExecutionTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void instantExecutionResult(edu.pict.grpc.submission.SubmissionRequest request,
        io.grpc.stub.StreamObserver<edu.pict.grpc.submission.ExecutionResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInstantExecutionResultMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void submitCode(edu.pict.grpc.submission.BatchSubmissionRequest request,
        io.grpc.stub.StreamObserver<edu.pict.grpc.submission.BatchSubmissionTokens> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubmitCodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSubmitCodeResponseFromTokens(edu.pict.grpc.submission.BatchSubmissionTokens request,
        io.grpc.stub.StreamObserver<edu.pict.grpc.submission.BatchSubmissionTokensResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSubmitCodeResponseFromTokensMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SubmissionService.
   */
  public static final class SubmissionServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<SubmissionServiceBlockingV2Stub> {
    private SubmissionServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubmissionServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SubmissionServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public edu.pict.grpc.submission.SubmissionResponseToken submitRequest(edu.pict.grpc.submission.SubmissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubmitRequestMethod(), getCallOptions(), request);
    }

    /**
     */
    public edu.pict.grpc.submission.ExecutionResult getResultByExecutionToken(edu.pict.grpc.submission.SubmissionResponseToken request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetResultByExecutionTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public edu.pict.grpc.submission.ExecutionResult instantExecutionResult(edu.pict.grpc.submission.SubmissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInstantExecutionResultMethod(), getCallOptions(), request);
    }

    /**
     */
    public edu.pict.grpc.submission.BatchSubmissionTokens submitCode(edu.pict.grpc.submission.BatchSubmissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubmitCodeMethod(), getCallOptions(), request);
    }

    /**
     */
    public edu.pict.grpc.submission.BatchSubmissionTokensResponse getSubmitCodeResponseFromTokens(edu.pict.grpc.submission.BatchSubmissionTokens request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSubmitCodeResponseFromTokensMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service SubmissionService.
   */
  public static final class SubmissionServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SubmissionServiceBlockingStub> {
    private SubmissionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubmissionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SubmissionServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public edu.pict.grpc.submission.SubmissionResponseToken submitRequest(edu.pict.grpc.submission.SubmissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubmitRequestMethod(), getCallOptions(), request);
    }

    /**
     */
    public edu.pict.grpc.submission.ExecutionResult getResultByExecutionToken(edu.pict.grpc.submission.SubmissionResponseToken request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetResultByExecutionTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public edu.pict.grpc.submission.ExecutionResult instantExecutionResult(edu.pict.grpc.submission.SubmissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInstantExecutionResultMethod(), getCallOptions(), request);
    }

    /**
     */
    public edu.pict.grpc.submission.BatchSubmissionTokens submitCode(edu.pict.grpc.submission.BatchSubmissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubmitCodeMethod(), getCallOptions(), request);
    }

    /**
     */
    public edu.pict.grpc.submission.BatchSubmissionTokensResponse getSubmitCodeResponseFromTokens(edu.pict.grpc.submission.BatchSubmissionTokens request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSubmitCodeResponseFromTokensMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SubmissionService.
   */
  public static final class SubmissionServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<SubmissionServiceFutureStub> {
    private SubmissionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubmissionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SubmissionServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<edu.pict.grpc.submission.SubmissionResponseToken> submitRequest(
        edu.pict.grpc.submission.SubmissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubmitRequestMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<edu.pict.grpc.submission.ExecutionResult> getResultByExecutionToken(
        edu.pict.grpc.submission.SubmissionResponseToken request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetResultByExecutionTokenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<edu.pict.grpc.submission.ExecutionResult> instantExecutionResult(
        edu.pict.grpc.submission.SubmissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInstantExecutionResultMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<edu.pict.grpc.submission.BatchSubmissionTokens> submitCode(
        edu.pict.grpc.submission.BatchSubmissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubmitCodeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<edu.pict.grpc.submission.BatchSubmissionTokensResponse> getSubmitCodeResponseFromTokens(
        edu.pict.grpc.submission.BatchSubmissionTokens request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSubmitCodeResponseFromTokensMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUBMIT_REQUEST = 0;
  private static final int METHODID_GET_RESULT_BY_EXECUTION_TOKEN = 1;
  private static final int METHODID_INSTANT_EXECUTION_RESULT = 2;
  private static final int METHODID_SUBMIT_CODE = 3;
  private static final int METHODID_GET_SUBMIT_CODE_RESPONSE_FROM_TOKENS = 4;

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
        case METHODID_SUBMIT_REQUEST:
          serviceImpl.submitRequest((edu.pict.grpc.submission.SubmissionRequest) request,
              (io.grpc.stub.StreamObserver<edu.pict.grpc.submission.SubmissionResponseToken>) responseObserver);
          break;
        case METHODID_GET_RESULT_BY_EXECUTION_TOKEN:
          serviceImpl.getResultByExecutionToken((edu.pict.grpc.submission.SubmissionResponseToken) request,
              (io.grpc.stub.StreamObserver<edu.pict.grpc.submission.ExecutionResult>) responseObserver);
          break;
        case METHODID_INSTANT_EXECUTION_RESULT:
          serviceImpl.instantExecutionResult((edu.pict.grpc.submission.SubmissionRequest) request,
              (io.grpc.stub.StreamObserver<edu.pict.grpc.submission.ExecutionResult>) responseObserver);
          break;
        case METHODID_SUBMIT_CODE:
          serviceImpl.submitCode((edu.pict.grpc.submission.BatchSubmissionRequest) request,
              (io.grpc.stub.StreamObserver<edu.pict.grpc.submission.BatchSubmissionTokens>) responseObserver);
          break;
        case METHODID_GET_SUBMIT_CODE_RESPONSE_FROM_TOKENS:
          serviceImpl.getSubmitCodeResponseFromTokens((edu.pict.grpc.submission.BatchSubmissionTokens) request,
              (io.grpc.stub.StreamObserver<edu.pict.grpc.submission.BatchSubmissionTokensResponse>) responseObserver);
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
          getSubmitRequestMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              edu.pict.grpc.submission.SubmissionRequest,
              edu.pict.grpc.submission.SubmissionResponseToken>(
                service, METHODID_SUBMIT_REQUEST)))
        .addMethod(
          getGetResultByExecutionTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              edu.pict.grpc.submission.SubmissionResponseToken,
              edu.pict.grpc.submission.ExecutionResult>(
                service, METHODID_GET_RESULT_BY_EXECUTION_TOKEN)))
        .addMethod(
          getInstantExecutionResultMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              edu.pict.grpc.submission.SubmissionRequest,
              edu.pict.grpc.submission.ExecutionResult>(
                service, METHODID_INSTANT_EXECUTION_RESULT)))
        .addMethod(
          getSubmitCodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              edu.pict.grpc.submission.BatchSubmissionRequest,
              edu.pict.grpc.submission.BatchSubmissionTokens>(
                service, METHODID_SUBMIT_CODE)))
        .addMethod(
          getGetSubmitCodeResponseFromTokensMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              edu.pict.grpc.submission.BatchSubmissionTokens,
              edu.pict.grpc.submission.BatchSubmissionTokensResponse>(
                service, METHODID_GET_SUBMIT_CODE_RESPONSE_FROM_TOKENS)))
        .build();
  }

  private static abstract class SubmissionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SubmissionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return edu.pict.grpc.submission.SubmissionServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SubmissionService");
    }
  }

  private static final class SubmissionServiceFileDescriptorSupplier
      extends SubmissionServiceBaseDescriptorSupplier {
    SubmissionServiceFileDescriptorSupplier() {}
  }

  private static final class SubmissionServiceMethodDescriptorSupplier
      extends SubmissionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SubmissionServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (SubmissionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SubmissionServiceFileDescriptorSupplier())
              .addMethod(getSubmitRequestMethod())
              .addMethod(getGetResultByExecutionTokenMethod())
              .addMethod(getInstantExecutionResultMethod())
              .addMethod(getSubmitCodeMethod())
              .addMethod(getGetSubmitCodeResponseFromTokensMethod())
              .build();
        }
      }
    }
    return result;
  }
}
