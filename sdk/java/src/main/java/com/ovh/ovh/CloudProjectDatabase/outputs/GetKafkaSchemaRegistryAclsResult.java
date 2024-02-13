// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.CloudProjectDatabase.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetKafkaSchemaRegistryAclsResult {
    /**
     * @return The list of schema refistry ACLs ids of the kafka cluster associated with the project.
     * 
     */
    private List<String> aclIds;
    /**
     * @return See Argument Reference above.
     * 
     */
    private String clusterId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return See Argument Reference above.
     * 
     */
    private String serviceName;

    private GetKafkaSchemaRegistryAclsResult() {}
    /**
     * @return The list of schema refistry ACLs ids of the kafka cluster associated with the project.
     * 
     */
    public List<String> aclIds() {
        return this.aclIds;
    }
    /**
     * @return See Argument Reference above.
     * 
     */
    public String clusterId() {
        return this.clusterId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return See Argument Reference above.
     * 
     */
    public String serviceName() {
        return this.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKafkaSchemaRegistryAclsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> aclIds;
        private String clusterId;
        private String id;
        private String serviceName;
        public Builder() {}
        public Builder(GetKafkaSchemaRegistryAclsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aclIds = defaults.aclIds;
    	      this.clusterId = defaults.clusterId;
    	      this.id = defaults.id;
    	      this.serviceName = defaults.serviceName;
        }

        @CustomType.Setter
        public Builder aclIds(List<String> aclIds) {
            this.aclIds = Objects.requireNonNull(aclIds);
            return this;
        }
        public Builder aclIds(String... aclIds) {
            return aclIds(List.of(aclIds));
        }
        @CustomType.Setter
        public Builder clusterId(String clusterId) {
            this.clusterId = Objects.requireNonNull(clusterId);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public GetKafkaSchemaRegistryAclsResult build() {
            final var o = new GetKafkaSchemaRegistryAclsResult();
            o.aclIds = aclIds;
            o.clusterId = clusterId;
            o.id = id;
            o.serviceName = serviceName;
            return o;
        }
    }
}
