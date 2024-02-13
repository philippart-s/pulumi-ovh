// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.CloudProject.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetKubeIpRestrictionsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The list of CIDRs that restricts the access to the API server.
     * 
     */
    private List<String> ips;
    /**
     * @return See Argument Reference above.
     * 
     */
    private String kubeId;
    /**
     * @return See Argument Reference above.
     * 
     */
    private String serviceName;

    private GetKubeIpRestrictionsResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The list of CIDRs that restricts the access to the API server.
     * 
     */
    public List<String> ips() {
        return this.ips;
    }
    /**
     * @return See Argument Reference above.
     * 
     */
    public String kubeId() {
        return this.kubeId;
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

    public static Builder builder(GetKubeIpRestrictionsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<String> ips;
        private String kubeId;
        private String serviceName;
        public Builder() {}
        public Builder(GetKubeIpRestrictionsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ips = defaults.ips;
    	      this.kubeId = defaults.kubeId;
    	      this.serviceName = defaults.serviceName;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ips(List<String> ips) {
            this.ips = Objects.requireNonNull(ips);
            return this;
        }
        public Builder ips(String... ips) {
            return ips(List.of(ips));
        }
        @CustomType.Setter
        public Builder kubeId(String kubeId) {
            this.kubeId = Objects.requireNonNull(kubeId);
            return this;
        }
        @CustomType.Setter
        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public GetKubeIpRestrictionsResult build() {
            final var o = new GetKubeIpRestrictionsResult();
            o.id = id;
            o.ips = ips;
            o.kubeId = kubeId;
            o.serviceName = serviceName;
            return o;
        }
    }
}
