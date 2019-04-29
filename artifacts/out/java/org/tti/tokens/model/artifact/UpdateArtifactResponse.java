// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: artifact.proto

package org.tti.tokens.model.artifact;

/**
 * Protobuf type {@code taxonomy.model.artifact.UpdateArtifactResponse}
 */
public  final class UpdateArtifactResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:taxonomy.model.artifact.UpdateArtifactResponse)
    UpdateArtifactResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateArtifactResponse.newBuilder() to construct.
  private UpdateArtifactResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateArtifactResponse() {
    type_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateArtifactResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {
            int rawValue = input.readEnum();

            type_ = rawValue;
            break;
          }
          case 18: {
            com.google.protobuf.Any.Builder subBuilder = null;
            if (artifactTypeObject_ != null) {
              subBuilder = artifactTypeObject_.toBuilder();
            }
            artifactTypeObject_ = input.readMessage(com.google.protobuf.Any.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(artifactTypeObject_);
              artifactTypeObject_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tti.tokens.model.artifact.ArtifactOuterClass.internal_static_taxonomy_model_artifact_UpdateArtifactResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tti.tokens.model.artifact.ArtifactOuterClass.internal_static_taxonomy_model_artifact_UpdateArtifactResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tti.tokens.model.artifact.UpdateArtifactResponse.class, org.tti.tokens.model.artifact.UpdateArtifactResponse.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <code>.taxonomy.model.artifact.ArtifactType type = 1;</code>
   */
  public int getTypeValue() {
    return type_;
  }
  /**
   * <code>.taxonomy.model.artifact.ArtifactType type = 1;</code>
   */
  public org.tti.tokens.model.artifact.ArtifactType getType() {
    @SuppressWarnings("deprecation")
    org.tti.tokens.model.artifact.ArtifactType result = org.tti.tokens.model.artifact.ArtifactType.valueOf(type_);
    return result == null ? org.tti.tokens.model.artifact.ArtifactType.UNRECOGNIZED : result;
  }

  public static final int ARTIFACT_TYPE_OBJECT_FIELD_NUMBER = 2;
  private com.google.protobuf.Any artifactTypeObject_;
  /**
   * <pre>
   *deserialize based on type
   * </pre>
   *
   * <code>.google.protobuf.Any artifact_type_object = 2;</code>
   */
  public boolean hasArtifactTypeObject() {
    return artifactTypeObject_ != null;
  }
  /**
   * <pre>
   *deserialize based on type
   * </pre>
   *
   * <code>.google.protobuf.Any artifact_type_object = 2;</code>
   */
  public com.google.protobuf.Any getArtifactTypeObject() {
    return artifactTypeObject_ == null ? com.google.protobuf.Any.getDefaultInstance() : artifactTypeObject_;
  }
  /**
   * <pre>
   *deserialize based on type
   * </pre>
   *
   * <code>.google.protobuf.Any artifact_type_object = 2;</code>
   */
  public com.google.protobuf.AnyOrBuilder getArtifactTypeObjectOrBuilder() {
    return getArtifactTypeObject();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (type_ != org.tti.tokens.model.artifact.ArtifactType.BASE.getNumber()) {
      output.writeEnum(1, type_);
    }
    if (artifactTypeObject_ != null) {
      output.writeMessage(2, getArtifactTypeObject());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != org.tti.tokens.model.artifact.ArtifactType.BASE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
    }
    if (artifactTypeObject_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getArtifactTypeObject());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.tti.tokens.model.artifact.UpdateArtifactResponse)) {
      return super.equals(obj);
    }
    org.tti.tokens.model.artifact.UpdateArtifactResponse other = (org.tti.tokens.model.artifact.UpdateArtifactResponse) obj;

    if (type_ != other.type_) return false;
    if (hasArtifactTypeObject() != other.hasArtifactTypeObject()) return false;
    if (hasArtifactTypeObject()) {
      if (!getArtifactTypeObject()
          .equals(other.getArtifactTypeObject())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    if (hasArtifactTypeObject()) {
      hash = (37 * hash) + ARTIFACT_TYPE_OBJECT_FIELD_NUMBER;
      hash = (53 * hash) + getArtifactTypeObject().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tti.tokens.model.artifact.UpdateArtifactResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tti.tokens.model.artifact.UpdateArtifactResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tti.tokens.model.artifact.UpdateArtifactResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tti.tokens.model.artifact.UpdateArtifactResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tti.tokens.model.artifact.UpdateArtifactResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tti.tokens.model.artifact.UpdateArtifactResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tti.tokens.model.artifact.UpdateArtifactResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tti.tokens.model.artifact.UpdateArtifactResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tti.tokens.model.artifact.UpdateArtifactResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tti.tokens.model.artifact.UpdateArtifactResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tti.tokens.model.artifact.UpdateArtifactResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tti.tokens.model.artifact.UpdateArtifactResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.tti.tokens.model.artifact.UpdateArtifactResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code taxonomy.model.artifact.UpdateArtifactResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:taxonomy.model.artifact.UpdateArtifactResponse)
      org.tti.tokens.model.artifact.UpdateArtifactResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tti.tokens.model.artifact.ArtifactOuterClass.internal_static_taxonomy_model_artifact_UpdateArtifactResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tti.tokens.model.artifact.ArtifactOuterClass.internal_static_taxonomy_model_artifact_UpdateArtifactResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tti.tokens.model.artifact.UpdateArtifactResponse.class, org.tti.tokens.model.artifact.UpdateArtifactResponse.Builder.class);
    }

    // Construct using org.tti.tokens.model.artifact.UpdateArtifactResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      type_ = 0;

      if (artifactTypeObjectBuilder_ == null) {
        artifactTypeObject_ = null;
      } else {
        artifactTypeObject_ = null;
        artifactTypeObjectBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tti.tokens.model.artifact.ArtifactOuterClass.internal_static_taxonomy_model_artifact_UpdateArtifactResponse_descriptor;
    }

    @java.lang.Override
    public org.tti.tokens.model.artifact.UpdateArtifactResponse getDefaultInstanceForType() {
      return org.tti.tokens.model.artifact.UpdateArtifactResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.tti.tokens.model.artifact.UpdateArtifactResponse build() {
      org.tti.tokens.model.artifact.UpdateArtifactResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tti.tokens.model.artifact.UpdateArtifactResponse buildPartial() {
      org.tti.tokens.model.artifact.UpdateArtifactResponse result = new org.tti.tokens.model.artifact.UpdateArtifactResponse(this);
      result.type_ = type_;
      if (artifactTypeObjectBuilder_ == null) {
        result.artifactTypeObject_ = artifactTypeObject_;
      } else {
        result.artifactTypeObject_ = artifactTypeObjectBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.tti.tokens.model.artifact.UpdateArtifactResponse) {
        return mergeFrom((org.tti.tokens.model.artifact.UpdateArtifactResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tti.tokens.model.artifact.UpdateArtifactResponse other) {
      if (other == org.tti.tokens.model.artifact.UpdateArtifactResponse.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.hasArtifactTypeObject()) {
        mergeArtifactTypeObject(other.getArtifactTypeObject());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.tti.tokens.model.artifact.UpdateArtifactResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tti.tokens.model.artifact.UpdateArtifactResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int type_ = 0;
    /**
     * <code>.taxonomy.model.artifact.ArtifactType type = 1;</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.taxonomy.model.artifact.ArtifactType type = 1;</code>
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.taxonomy.model.artifact.ArtifactType type = 1;</code>
     */
    public org.tti.tokens.model.artifact.ArtifactType getType() {
      @SuppressWarnings("deprecation")
      org.tti.tokens.model.artifact.ArtifactType result = org.tti.tokens.model.artifact.ArtifactType.valueOf(type_);
      return result == null ? org.tti.tokens.model.artifact.ArtifactType.UNRECOGNIZED : result;
    }
    /**
     * <code>.taxonomy.model.artifact.ArtifactType type = 1;</code>
     */
    public Builder setType(org.tti.tokens.model.artifact.ArtifactType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.taxonomy.model.artifact.ArtifactType type = 1;</code>
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Any artifactTypeObject_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> artifactTypeObjectBuilder_;
    /**
     * <pre>
     *deserialize based on type
     * </pre>
     *
     * <code>.google.protobuf.Any artifact_type_object = 2;</code>
     */
    public boolean hasArtifactTypeObject() {
      return artifactTypeObjectBuilder_ != null || artifactTypeObject_ != null;
    }
    /**
     * <pre>
     *deserialize based on type
     * </pre>
     *
     * <code>.google.protobuf.Any artifact_type_object = 2;</code>
     */
    public com.google.protobuf.Any getArtifactTypeObject() {
      if (artifactTypeObjectBuilder_ == null) {
        return artifactTypeObject_ == null ? com.google.protobuf.Any.getDefaultInstance() : artifactTypeObject_;
      } else {
        return artifactTypeObjectBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     *deserialize based on type
     * </pre>
     *
     * <code>.google.protobuf.Any artifact_type_object = 2;</code>
     */
    public Builder setArtifactTypeObject(com.google.protobuf.Any value) {
      if (artifactTypeObjectBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        artifactTypeObject_ = value;
        onChanged();
      } else {
        artifactTypeObjectBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     *deserialize based on type
     * </pre>
     *
     * <code>.google.protobuf.Any artifact_type_object = 2;</code>
     */
    public Builder setArtifactTypeObject(
        com.google.protobuf.Any.Builder builderForValue) {
      if (artifactTypeObjectBuilder_ == null) {
        artifactTypeObject_ = builderForValue.build();
        onChanged();
      } else {
        artifactTypeObjectBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     *deserialize based on type
     * </pre>
     *
     * <code>.google.protobuf.Any artifact_type_object = 2;</code>
     */
    public Builder mergeArtifactTypeObject(com.google.protobuf.Any value) {
      if (artifactTypeObjectBuilder_ == null) {
        if (artifactTypeObject_ != null) {
          artifactTypeObject_ =
            com.google.protobuf.Any.newBuilder(artifactTypeObject_).mergeFrom(value).buildPartial();
        } else {
          artifactTypeObject_ = value;
        }
        onChanged();
      } else {
        artifactTypeObjectBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     *deserialize based on type
     * </pre>
     *
     * <code>.google.protobuf.Any artifact_type_object = 2;</code>
     */
    public Builder clearArtifactTypeObject() {
      if (artifactTypeObjectBuilder_ == null) {
        artifactTypeObject_ = null;
        onChanged();
      } else {
        artifactTypeObject_ = null;
        artifactTypeObjectBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     *deserialize based on type
     * </pre>
     *
     * <code>.google.protobuf.Any artifact_type_object = 2;</code>
     */
    public com.google.protobuf.Any.Builder getArtifactTypeObjectBuilder() {
      
      onChanged();
      return getArtifactTypeObjectFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     *deserialize based on type
     * </pre>
     *
     * <code>.google.protobuf.Any artifact_type_object = 2;</code>
     */
    public com.google.protobuf.AnyOrBuilder getArtifactTypeObjectOrBuilder() {
      if (artifactTypeObjectBuilder_ != null) {
        return artifactTypeObjectBuilder_.getMessageOrBuilder();
      } else {
        return artifactTypeObject_ == null ?
            com.google.protobuf.Any.getDefaultInstance() : artifactTypeObject_;
      }
    }
    /**
     * <pre>
     *deserialize based on type
     * </pre>
     *
     * <code>.google.protobuf.Any artifact_type_object = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> 
        getArtifactTypeObjectFieldBuilder() {
      if (artifactTypeObjectBuilder_ == null) {
        artifactTypeObjectBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder>(
                getArtifactTypeObject(),
                getParentForChildren(),
                isClean());
        artifactTypeObject_ = null;
      }
      return artifactTypeObjectBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:taxonomy.model.artifact.UpdateArtifactResponse)
  }

  // @@protoc_insertion_point(class_scope:taxonomy.model.artifact.UpdateArtifactResponse)
  private static final org.tti.tokens.model.artifact.UpdateArtifactResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tti.tokens.model.artifact.UpdateArtifactResponse();
  }

  public static org.tti.tokens.model.artifact.UpdateArtifactResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateArtifactResponse>
      PARSER = new com.google.protobuf.AbstractParser<UpdateArtifactResponse>() {
    @java.lang.Override
    public UpdateArtifactResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateArtifactResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateArtifactResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateArtifactResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tti.tokens.model.artifact.UpdateArtifactResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
