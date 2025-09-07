package edu.pict.grpc.userHistory;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class UserHistoryServiceGrpc {

  private UserHistoryServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "UserHistoryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<edu.pict.grpc.userHistory.UserHistory,
      edu.pict.grpc.userHistory.RegisterHistoryResponse> getRegisterHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "registerHistory",
      requestType = edu.pict.grpc.userHistory.UserHistory.class,
      responseType = edu.pict.grpc.userHistory.RegisterHistoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edu.pict.grpc.userHistory.UserHistory,
      edu.pict.grpc.userHistory.RegisterHistoryResponse> getRegisterHistoryMethod() {
    io.grpc.MethodDescriptor<edu.pict.grpc.userHistory.UserHistory, edu.pict.grpc.userHistory.RegisterHistoryResponse> getRegisterHistoryMethod;
    if ((getRegisterHistoryMethod = UserHistoryServiceGrpc.getRegisterHistoryMethod) == null) {
      synchronized (UserHistoryServiceGrpc.class) {
        if ((getRegisterHistoryMethod = UserHistoryServiceGrpc.getRegisterHistoryMethod) == null) {
          UserHistoryServiceGrpc.getRegisterHistoryMethod = getRegisterHistoryMethod =
              io.grpc.MethodDescriptor.<edu.pict.grpc.userHistory.UserHistory, edu.pict.grpc.userHistory.RegisterHistoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "registerHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.pict.grpc.userHistory.UserHistory.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.pict.grpc.userHistory.RegisterHistoryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserHistoryServiceMethodDescriptorSupplier("registerHistory"))
              .build();
        }
      }
    }
    return getRegisterHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<edu.pict.grpc.userHistory.FetchUserHistoryRequest,
      edu.pict.grpc.userHistory.FetchUserHistoryResponse> getFetchUserHistoryByUsernameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "fetchUserHistoryByUsername",
      requestType = edu.pict.grpc.userHistory.FetchUserHistoryRequest.class,
      responseType = edu.pict.grpc.userHistory.FetchUserHistoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edu.pict.grpc.userHistory.FetchUserHistoryRequest,
      edu.pict.grpc.userHistory.FetchUserHistoryResponse> getFetchUserHistoryByUsernameMethod() {
    io.grpc.MethodDescriptor<edu.pict.grpc.userHistory.FetchUserHistoryRequest, edu.pict.grpc.userHistory.FetchUserHistoryResponse> getFetchUserHistoryByUsernameMethod;
    if ((getFetchUserHistoryByUsernameMethod = UserHistoryServiceGrpc.getFetchUserHistoryByUsernameMethod) == null) {
      synchronized (UserHistoryServiceGrpc.class) {
        if ((getFetchUserHistoryByUsernameMethod = UserHistoryServiceGrpc.getFetchUserHistoryByUsernameMethod) == null) {
          UserHistoryServiceGrpc.getFetchUserHistoryByUsernameMethod = getFetchUserHistoryByUsernameMethod =
              io.grpc.MethodDescriptor.<edu.pict.grpc.userHistory.FetchUserHistoryRequest, edu.pict.grpc.userHistory.FetchUserHistoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "fetchUserHistoryByUsername"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.pict.grpc.userHistory.FetchUserHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.pict.grpc.userHistory.FetchUserHistoryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserHistoryServiceMethodDescriptorSupplier("fetchUserHistoryByUsername"))
              .build();
        }
      }
    }
    return getFetchUserHistoryByUsernameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<edu.pict.grpc.userHistory.FetchUserHistoryByUsernameAndQuestionIdRequest,
      edu.pict.grpc.userHistory.FetchUserHistoryByUsernameAndQuestionIdResponse> getFetchUserHistoryByUsernameAndQuestionIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "fetchUserHistoryByUsernameAndQuestionId",
      requestType = edu.pict.grpc.userHistory.FetchUserHistoryByUsernameAndQuestionIdRequest.class,
      responseType = edu.pict.grpc.userHistory.FetchUserHistoryByUsernameAndQuestionIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edu.pict.grpc.userHistory.FetchUserHistoryByUsernameAndQuestionIdRequest,
      edu.pict.grpc.userHistory.FetchUserHistoryByUsernameAndQuestionIdResponse> getFetchUserHistoryByUsernameAndQuestionIdMethod() {
    io.grpc.MethodDescriptor<edu.pict.grpc.userHistory.FetchUserHistoryByUsernameAndQuestionIdRequest, edu.pict.grpc.userHistory.FetchUserHistoryByUsernameAndQuestionIdResponse> getFetchUserHistoryByUsernameAndQuestionIdMethod;
    if ((getFetchUserHistoryByUsernameAndQuestionIdMethod = UserHistoryServiceGrpc.getFetchUserHistoryByUsernameAndQuestionIdMethod) == null) {
      synchronized (UserHistoryServiceGrpc.class) {
        if ((getFetchUserHistoryByUsernameAndQuestionIdMethod = UserHistoryServiceGrpc.getFetchUserHistoryByUsernameAndQuestionIdMethod) == null) {
          UserHistoryServiceGrpc.getFetchUserHistoryByUsernameAndQuestionIdMethod = getFetchUserHistoryByUsernameAndQuestionIdMethod =
              io.grpc.MethodDescriptor.<edu.pict.grpc.userHistory.FetchUserHistoryByUsernameAndQuestionIdRequest, edu.pict.grpc.userHistory.FetchUserHistoryByUsernameAndQuestionIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "fetchUserHistoryByUsernameAndQuestionId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.pict.grpc.userHistory.FetchUserHistoryByUsernameAndQuestionIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.pict.grpc.userHistory.FetchUserHistoryByUsernameAndQuestionIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserHistoryServiceMethodDescriptorSupplier("fetchUserHistoryByUsernameAndQuestionId"))
              .build();
        }
      }
    }
    return getFetchUserHistoryByUsernameAndQuestionIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<edu.pict.grpc.userHistory.DeleteHistoryByUsername,
      edu.pict.grpc.userHistory.DeleteResponse> getDeleteHistoryByUsernameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteHistoryByUsername",
      requestType = edu.pict.grpc.userHistory.DeleteHistoryByUsername.class,
      responseType = edu.pict.grpc.userHistory.DeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edu.pict.grpc.userHistory.DeleteHistoryByUsername,
      edu.pict.grpc.userHistory.DeleteResponse> getDeleteHistoryByUsernameMethod() {
    io.grpc.MethodDescriptor<edu.pict.grpc.userHistory.DeleteHistoryByUsername, edu.pict.grpc.userHistory.DeleteResponse> getDeleteHistoryByUsernameMethod;
    if ((getDeleteHistoryByUsernameMethod = UserHistoryServiceGrpc.getDeleteHistoryByUsernameMethod) == null) {
      synchronized (UserHistoryServiceGrpc.class) {
        if ((getDeleteHistoryByUsernameMethod = UserHistoryServiceGrpc.getDeleteHistoryByUsernameMethod) == null) {
          UserHistoryServiceGrpc.getDeleteHistoryByUsernameMethod = getDeleteHistoryByUsernameMethod =
              io.grpc.MethodDescriptor.<edu.pict.grpc.userHistory.DeleteHistoryByUsername, edu.pict.grpc.userHistory.DeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteHistoryByUsername"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.pict.grpc.userHistory.DeleteHistoryByUsername.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.pict.grpc.userHistory.DeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserHistoryServiceMethodDescriptorSupplier("deleteHistoryByUsername"))
              .build();
        }
      }
    }
    return getDeleteHistoryByUsernameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<edu.pict.grpc.userHistory.DeleteHistoryByQuestionId,
      edu.pict.grpc.userHistory.DeleteResponse> getDeleteHistoryByQuestionIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteHistoryByQuestionId",
      requestType = edu.pict.grpc.userHistory.DeleteHistoryByQuestionId.class,
      responseType = edu.pict.grpc.userHistory.DeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edu.pict.grpc.userHistory.DeleteHistoryByQuestionId,
      edu.pict.grpc.userHistory.DeleteResponse> getDeleteHistoryByQuestionIdMethod() {
    io.grpc.MethodDescriptor<edu.pict.grpc.userHistory.DeleteHistoryByQuestionId, edu.pict.grpc.userHistory.DeleteResponse> getDeleteHistoryByQuestionIdMethod;
    if ((getDeleteHistoryByQuestionIdMethod = UserHistoryServiceGrpc.getDeleteHistoryByQuestionIdMethod) == null) {
      synchronized (UserHistoryServiceGrpc.class) {
        if ((getDeleteHistoryByQuestionIdMethod = UserHistoryServiceGrpc.getDeleteHistoryByQuestionIdMethod) == null) {
          UserHistoryServiceGrpc.getDeleteHistoryByQuestionIdMethod = getDeleteHistoryByQuestionIdMethod =
              io.grpc.MethodDescriptor.<edu.pict.grpc.userHistory.DeleteHistoryByQuestionId, edu.pict.grpc.userHistory.DeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteHistoryByQuestionId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.pict.grpc.userHistory.DeleteHistoryByQuestionId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.pict.grpc.userHistory.DeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserHistoryServiceMethodDescriptorSupplier("deleteHistoryByQuestionId"))
              .build();
        }
      }
    }
    return getDeleteHistoryByQuestionIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserHistoryServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserHistoryServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserHistoryServiceStub>() {
        @java.lang.Override
        public UserHistoryServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserHistoryServiceStub(channel, callOptions);
        }
      };
    return UserHistoryServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static UserHistoryServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserHistoryServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserHistoryServiceBlockingV2Stub>() {
        @java.lang.Override
        public UserHistoryServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserHistoryServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return UserHistoryServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserHistoryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserHistoryServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserHistoryServiceBlockingStub>() {
        @java.lang.Override
        public UserHistoryServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserHistoryServiceBlockingStub(channel, callOptions);
        }
      };
    return UserHistoryServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserHistoryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserHistoryServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserHistoryServiceFutureStub>() {
        @java.lang.Override
        public UserHistoryServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserHistoryServiceFutureStub(channel, callOptions);
        }
      };
    return UserHistoryServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Add history of User
     * </pre>
     */
    default void registerHistory(edu.pict.grpc.userHistory.UserHistory request,
        io.grpc.stub.StreamObserver<edu.pict.grpc.userHistory.RegisterHistoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterHistoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Fetches UserHistory
     * </pre>
     */
    default void fetchUserHistoryByUsername(edu.pict.grpc.userHistory.FetchUserHistoryRequest request,
        io.grpc.stub.StreamObserver<edu.pict.grpc.userHistory.FetchUserHistoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFetchUserHistoryByUsernameMethod(), responseObserver);
    }

    /**
     */
    default void fetchUserHistoryByUsernameAndQuestionId(edu.pict.grpc.userHistory.FetchUserHistoryByUsernameAndQuestionIdRequest request,
        io.grpc.stub.StreamObserver<edu.pict.grpc.userHistory.FetchUserHistoryByUsernameAndQuestionIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFetchUserHistoryByUsernameAndQuestionIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete User History
     * </pre>
     */
    default void deleteHistoryByUsername(edu.pict.grpc.userHistory.DeleteHistoryByUsername request,
        io.grpc.stub.StreamObserver<edu.pict.grpc.userHistory.DeleteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteHistoryByUsernameMethod(), responseObserver);
    }

    /**
     */
    default void deleteHistoryByQuestionId(edu.pict.grpc.userHistory.DeleteHistoryByQuestionId request,
        io.grpc.stub.StreamObserver<edu.pict.grpc.userHistory.DeleteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteHistoryByQuestionIdMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service UserHistoryService.
   */
  public static abstract class UserHistoryServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return UserHistoryServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service UserHistoryService.
   */
  public static final class UserHistoryServiceStub
      extends io.grpc.stub.AbstractAsyncStub<UserHistoryServiceStub> {
    private UserHistoryServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserHistoryServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserHistoryServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Add history of User
     * </pre>
     */
    public void registerHistory(edu.pict.grpc.userHistory.UserHistory request,
        io.grpc.stub.StreamObserver<edu.pict.grpc.userHistory.RegisterHistoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Fetches UserHistory
     * </pre>
     */
    public void fetchUserHistoryByUsername(edu.pict.grpc.userHistory.FetchUserHistoryRequest request,
        io.grpc.stub.StreamObserver<edu.pict.grpc.userHistory.FetchUserHistoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFetchUserHistoryByUsernameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void fetchUserHistoryByUsernameAndQuestionId(edu.pict.grpc.userHistory.FetchUserHistoryByUsernameAndQuestionIdRequest request,
        io.grpc.stub.StreamObserver<edu.pict.grpc.userHistory.FetchUserHistoryByUsernameAndQuestionIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFetchUserHistoryByUsernameAndQuestionIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete User History
     * </pre>
     */
    public void deleteHistoryByUsername(edu.pict.grpc.userHistory.DeleteHistoryByUsername request,
        io.grpc.stub.StreamObserver<edu.pict.grpc.userHistory.DeleteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteHistoryByUsernameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteHistoryByQuestionId(edu.pict.grpc.userHistory.DeleteHistoryByQuestionId request,
        io.grpc.stub.StreamObserver<edu.pict.grpc.userHistory.DeleteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteHistoryByQuestionIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service UserHistoryService.
   */
  public static final class UserHistoryServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<UserHistoryServiceBlockingV2Stub> {
    private UserHistoryServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserHistoryServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserHistoryServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Add history of User
     * </pre>
     */
    public edu.pict.grpc.userHistory.RegisterHistoryResponse registerHistory(edu.pict.grpc.userHistory.UserHistory request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterHistoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Fetches UserHistory
     * </pre>
     */
    public edu.pict.grpc.userHistory.FetchUserHistoryResponse fetchUserHistoryByUsername(edu.pict.grpc.userHistory.FetchUserHistoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFetchUserHistoryByUsernameMethod(), getCallOptions(), request);
    }

    /**
     */
    public edu.pict.grpc.userHistory.FetchUserHistoryByUsernameAndQuestionIdResponse fetchUserHistoryByUsernameAndQuestionId(edu.pict.grpc.userHistory.FetchUserHistoryByUsernameAndQuestionIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFetchUserHistoryByUsernameAndQuestionIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete User History
     * </pre>
     */
    public edu.pict.grpc.userHistory.DeleteResponse deleteHistoryByUsername(edu.pict.grpc.userHistory.DeleteHistoryByUsername request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteHistoryByUsernameMethod(), getCallOptions(), request);
    }

    /**
     */
    public edu.pict.grpc.userHistory.DeleteResponse deleteHistoryByQuestionId(edu.pict.grpc.userHistory.DeleteHistoryByQuestionId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteHistoryByQuestionIdMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service UserHistoryService.
   */
  public static final class UserHistoryServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<UserHistoryServiceBlockingStub> {
    private UserHistoryServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserHistoryServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserHistoryServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Add history of User
     * </pre>
     */
    public edu.pict.grpc.userHistory.RegisterHistoryResponse registerHistory(edu.pict.grpc.userHistory.UserHistory request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterHistoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Fetches UserHistory
     * </pre>
     */
    public edu.pict.grpc.userHistory.FetchUserHistoryResponse fetchUserHistoryByUsername(edu.pict.grpc.userHistory.FetchUserHistoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFetchUserHistoryByUsernameMethod(), getCallOptions(), request);
    }

    /**
     */
    public edu.pict.grpc.userHistory.FetchUserHistoryByUsernameAndQuestionIdResponse fetchUserHistoryByUsernameAndQuestionId(edu.pict.grpc.userHistory.FetchUserHistoryByUsernameAndQuestionIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFetchUserHistoryByUsernameAndQuestionIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete User History
     * </pre>
     */
    public edu.pict.grpc.userHistory.DeleteResponse deleteHistoryByUsername(edu.pict.grpc.userHistory.DeleteHistoryByUsername request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteHistoryByUsernameMethod(), getCallOptions(), request);
    }

    /**
     */
    public edu.pict.grpc.userHistory.DeleteResponse deleteHistoryByQuestionId(edu.pict.grpc.userHistory.DeleteHistoryByQuestionId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteHistoryByQuestionIdMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service UserHistoryService.
   */
  public static final class UserHistoryServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<UserHistoryServiceFutureStub> {
    private UserHistoryServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserHistoryServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserHistoryServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Add history of User
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<edu.pict.grpc.userHistory.RegisterHistoryResponse> registerHistory(
        edu.pict.grpc.userHistory.UserHistory request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterHistoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Fetches UserHistory
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<edu.pict.grpc.userHistory.FetchUserHistoryResponse> fetchUserHistoryByUsername(
        edu.pict.grpc.userHistory.FetchUserHistoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFetchUserHistoryByUsernameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<edu.pict.grpc.userHistory.FetchUserHistoryByUsernameAndQuestionIdResponse> fetchUserHistoryByUsernameAndQuestionId(
        edu.pict.grpc.userHistory.FetchUserHistoryByUsernameAndQuestionIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFetchUserHistoryByUsernameAndQuestionIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete User History
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<edu.pict.grpc.userHistory.DeleteResponse> deleteHistoryByUsername(
        edu.pict.grpc.userHistory.DeleteHistoryByUsername request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteHistoryByUsernameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<edu.pict.grpc.userHistory.DeleteResponse> deleteHistoryByQuestionId(
        edu.pict.grpc.userHistory.DeleteHistoryByQuestionId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteHistoryByQuestionIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_HISTORY = 0;
  private static final int METHODID_FETCH_USER_HISTORY_BY_USERNAME = 1;
  private static final int METHODID_FETCH_USER_HISTORY_BY_USERNAME_AND_QUESTION_ID = 2;
  private static final int METHODID_DELETE_HISTORY_BY_USERNAME = 3;
  private static final int METHODID_DELETE_HISTORY_BY_QUESTION_ID = 4;

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
        case METHODID_REGISTER_HISTORY:
          serviceImpl.registerHistory((edu.pict.grpc.userHistory.UserHistory) request,
              (io.grpc.stub.StreamObserver<edu.pict.grpc.userHistory.RegisterHistoryResponse>) responseObserver);
          break;
        case METHODID_FETCH_USER_HISTORY_BY_USERNAME:
          serviceImpl.fetchUserHistoryByUsername((edu.pict.grpc.userHistory.FetchUserHistoryRequest) request,
              (io.grpc.stub.StreamObserver<edu.pict.grpc.userHistory.FetchUserHistoryResponse>) responseObserver);
          break;
        case METHODID_FETCH_USER_HISTORY_BY_USERNAME_AND_QUESTION_ID:
          serviceImpl.fetchUserHistoryByUsernameAndQuestionId((edu.pict.grpc.userHistory.FetchUserHistoryByUsernameAndQuestionIdRequest) request,
              (io.grpc.stub.StreamObserver<edu.pict.grpc.userHistory.FetchUserHistoryByUsernameAndQuestionIdResponse>) responseObserver);
          break;
        case METHODID_DELETE_HISTORY_BY_USERNAME:
          serviceImpl.deleteHistoryByUsername((edu.pict.grpc.userHistory.DeleteHistoryByUsername) request,
              (io.grpc.stub.StreamObserver<edu.pict.grpc.userHistory.DeleteResponse>) responseObserver);
          break;
        case METHODID_DELETE_HISTORY_BY_QUESTION_ID:
          serviceImpl.deleteHistoryByQuestionId((edu.pict.grpc.userHistory.DeleteHistoryByQuestionId) request,
              (io.grpc.stub.StreamObserver<edu.pict.grpc.userHistory.DeleteResponse>) responseObserver);
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
          getRegisterHistoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              edu.pict.grpc.userHistory.UserHistory,
              edu.pict.grpc.userHistory.RegisterHistoryResponse>(
                service, METHODID_REGISTER_HISTORY)))
        .addMethod(
          getFetchUserHistoryByUsernameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              edu.pict.grpc.userHistory.FetchUserHistoryRequest,
              edu.pict.grpc.userHistory.FetchUserHistoryResponse>(
                service, METHODID_FETCH_USER_HISTORY_BY_USERNAME)))
        .addMethod(
          getFetchUserHistoryByUsernameAndQuestionIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              edu.pict.grpc.userHistory.FetchUserHistoryByUsernameAndQuestionIdRequest,
              edu.pict.grpc.userHistory.FetchUserHistoryByUsernameAndQuestionIdResponse>(
                service, METHODID_FETCH_USER_HISTORY_BY_USERNAME_AND_QUESTION_ID)))
        .addMethod(
          getDeleteHistoryByUsernameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              edu.pict.grpc.userHistory.DeleteHistoryByUsername,
              edu.pict.grpc.userHistory.DeleteResponse>(
                service, METHODID_DELETE_HISTORY_BY_USERNAME)))
        .addMethod(
          getDeleteHistoryByQuestionIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              edu.pict.grpc.userHistory.DeleteHistoryByQuestionId,
              edu.pict.grpc.userHistory.DeleteResponse>(
                service, METHODID_DELETE_HISTORY_BY_QUESTION_ID)))
        .build();
  }

  private static abstract class UserHistoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserHistoryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return edu.pict.grpc.userHistory.TestcaseServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserHistoryService");
    }
  }

  private static final class UserHistoryServiceFileDescriptorSupplier
      extends UserHistoryServiceBaseDescriptorSupplier {
    UserHistoryServiceFileDescriptorSupplier() {}
  }

  private static final class UserHistoryServiceMethodDescriptorSupplier
      extends UserHistoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    UserHistoryServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (UserHistoryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserHistoryServiceFileDescriptorSupplier())
              .addMethod(getRegisterHistoryMethod())
              .addMethod(getFetchUserHistoryByUsernameMethod())
              .addMethod(getFetchUserHistoryByUsernameAndQuestionIdMethod())
              .addMethod(getDeleteHistoryByUsernameMethod())
              .addMethod(getDeleteHistoryByQuestionIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
