// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.CloudProjectDatabase.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCertificatesResult {
    /**
     * @return CA certificate used for the service.
     * 
     */
    private String ca;
    /**
     * @return See Argument Reference above.
     * 
     */
    private String clusterId;
    /**
     * @return See Argument Reference above.
     * 
     */
    private String engine;
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

    private GetCertificatesResult() {}
    /**
     * @return CA certificate used for the service.
     * 
     */
    public String ca() {
        return this.ca;
    }
    /**
     * @return See Argument Reference above.
     * 
     */
    public String clusterId() {
        return this.clusterId;
    }
    /**
     * @return See Argument Reference above.
     * 
     */
    public String engine() {
        return this.engine;
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

    public static Builder builder(GetCertificatesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String ca;
        private String clusterId;
        private String engine;
        private String id;
        private String serviceName;
        public Builder() {}
        public Builder(GetCertificatesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ca = defaults.ca;
    	      this.clusterId = defaults.clusterId;
    	      this.engine = defaults.engine;
    	      this.id = defaults.id;
    	      this.serviceName = defaults.serviceName;
        }

        @CustomType.Setter
        public Builder ca(String ca) {
            this.ca = Objects.requireNonNull(ca);
            return this;
        }
        @CustomType.Setter
        public Builder clusterId(String clusterId) {
            this.clusterId = Objects.requireNonNull(clusterId);
            return this;
        }
        @CustomType.Setter
        public Builder engine(String engine) {
            this.engine = Objects.requireNonNull(engine);
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
        public GetCertificatesResult build() {
            final var o = new GetCertificatesResult();
            o.ca = ca;
            o.clusterId = clusterId;
            o.engine = engine;
            o.id = id;
            o.serviceName = serviceName;
            return o;
        }
    }
}
