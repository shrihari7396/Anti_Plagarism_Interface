package edu.pict;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class SubmissionServiceGrpc {

  private SubmissionServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "SubmissionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<edu.pict.SubmissionRequest,
      edu.pict.SubmissionResponseToken> getSubmitRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "submitRequest",
      requestType = edu.pict.SubmissionRequest.class,
      responseType = edu.pict.SubmissionResponseToken.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edu.pict.SubmissionRequest,
      edu.pict.SubmissionResponseToken> getSubmitRequestMethod() {
    io.grpc.MethodDescriptor<edu.pict.SubmissionRequest, edu.pict.SubmissionResponseToken> getSubmitRequestMethod;
    if ((getSubmitRequestMethod = SubmissionServiceGrpc.getSubmitRequestMethod) == null) {
      synchronized (SubmissionServiceGrpc.class) {
        if ((getSubmitRequestMethod = SubmissionServiceGrpc.getSubmitRequestMethod) == null) {
          SubmissionServiceGrpc.getSubmitRequestMethod = getSubmitRequestMethod =
              io.grpc.MethodDescriptor.<edu.pict.SubmissionRequest, edu.pict.SubmissionResponseToken>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "submitRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.pict.SubmissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.pict.SubmissionResponseToken.getDefaultInstance()))
              .setSchemaDescriptor(new SubmissionServiceMethodDescriptorSupplier("submitRequest"))
              .build();
        }
      }
    }
    return getSubmitRequestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<edu.pict.SubmissionResponseToken,
      edu.pict.ExecutionResult> getGetResultByExecutionTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getResultByExecutionToken",
      requestType = edu.pict.SubmissionResponseToken.class,
      responseType = edu.pict.ExecutionResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edu.pict.SubmissionResponseToken,
      edu.pict.ExecutionResult> getGetResultByExecutionTokenMethod() {
    io.grpc.MethodDescriptor<edu.pict.SubmissionResponseToken, edu.pict.ExecutionResult> getGetResultByExecutionTokenMethod;
    if ((getGetResultByExecutionTokenMethod = SubmissionServiceGrpc.getGetResultByExecutionTokenMethod) == null) {
      synchronized (SubmissionServiceGrpc.class) {
        if ((getGetResultByExecutionTokenMethod = SubmissionServiceGrpc.getGetResultByExecutionTokenMethod) == null) {
          SubmissionServiceGrpc.getGetResultByExecutionTokenMethod = getGetResultByExecutionTokenMethod =
              io.grpc.MethodDescriptor.<edu.pict.SubmissionResponseToken, edu.pict.ExecutionResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getResultByExecutionToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.pict.SubmissionResponseToken.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.pict.ExecutionResult.getDefaultInstance()))
              .setSchemaDescriptor(new SubmissionServiceMethodDescriptorSupplier("getResultByExecutionToken"))
              .build();
        }
      }
    }
    return getGetResultByExecutionTokenMethod;
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
    default void submitRequest(edu.pict.SubmissionRequest request,
        io.grpc.stub.StreamObserver<edu.pict.SubmissionResponseToken> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubmitRequestMethod(), responseObserver);
    }

    /**
     */
    default void getResultByExecutionToken(edu.pict.SubmissionResponseToken request,
        io.grpc.stub.StreamObserver<edu.pict.ExecutionResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetResultByExecutionTokenMethod(), responseObserver);
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
    public void submitRequest(edu.pict.SubmissionRequest request,
        io.grpc.stub.StreamObserver<edu.pict.SubmissionResponseToken> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubmitRequestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getResultByExecutionToken(edu.pict.SubmissionResponseToken request,
        io.grpc.stub.StreamObserver<edu.pict.ExecutionResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetResultByExecutionTokenMethod(), getCallOptions()), request, responseObserver);
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
    public edu.pict.SubmissionResponseToken submitRequest(edu.pict.SubmissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubmitRequestMethod(), getCallOptions(), request);
    }

    /**
     */
    public edu.pict.ExecutionResult getResultByExecutionToken(edu.pict.SubmissionResponseToken request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetResultByExecutionTokenMethod(), getCallOptions(), request);
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
    public edu.pict.SubmissionResponseToken submitRequest(edu.pict.SubmissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubmitRequestMethod(), getCallOptions(), request);
    }

    /**
     */
    public edu.pict.ExecutionResult getResultByExecutionToken(edu.pict.SubmissionResponseToken request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetResultByExecutionTokenMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<edu.pict.SubmissionResponseToken> submitRequest(
        edu.pict.SubmissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubmitRequestMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<edu.pict.ExecutionResult> getResultByExecutionToken(
        edu.pict.SubmissionResponseToken request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetResultByExecutionTokenMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUBMIT_REQUEST = 0;
  private static final int METHODID_GET_RESULT_BY_EXECUTION_TOKEN = 1;

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
          serviceImpl.submitRequest((edu.pict.SubmissionRequest) request,
              (io.grpc.stub.StreamObserver<edu.pict.SubmissionResponseToken>) responseObserver);
          break;
        case METHODID_GET_RESULT_BY_EXECUTION_TOKEN:
          serviceImpl.getResultByExecutionToken((edu.pict.SubmissionResponseToken) request,
              (io.grpc.stub.StreamObserver<edu.pict.ExecutionResult>) responseObserver);
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
              edu.pict.SubmissionRequest,
              edu.pict.SubmissionResponseToken>(
                service, METHODID_SUBMIT_REQUEST)))
        .addMethod(
          getGetResultByExecutionTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              edu.pict.SubmissionResponseToken,
              edu.pict.ExecutionResult>(
                service, METHODID_GET_RESULT_BY_EXECUTION_TOKEN)))
        .build();
  }

  private static abstract class SubmissionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SubmissionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return edu.pict.SubmissionServiceProto.getDescriptor();
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
              .build();
        }
      }
    }
    return result;
  }
}
