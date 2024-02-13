// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetServersResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The list of dedicated servers IDs associated with your OVHcloud Account.
     * 
     */
    private List<String> results;

    private GetServersResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The list of dedicated servers IDs associated with your OVHcloud Account.
     * 
     */
    public List<String> results() {
        return this.results;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServersResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<String> results;
        public Builder() {}
        public Builder(GetServersResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.results = defaults.results;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder results(List<String> results) {
            this.results = Objects.requireNonNull(results);
            return this;
        }
        public Builder results(String... results) {
            return results(List.of(results));
        }
        public GetServersResult build() {
            final var o = new GetServersResult();
            o.id = id;
            o.results = results;
            return o;
        }
    }
}
