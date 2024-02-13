// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.Iam.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetReferenceResourceTypeResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return List of resource types
     * 
     */
    private List<String> types;

    private GetReferenceResourceTypeResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return List of resource types
     * 
     */
    public List<String> types() {
        return this.types;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReferenceResourceTypeResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<String> types;
        public Builder() {}
        public Builder(GetReferenceResourceTypeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.types = defaults.types;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder types(List<String> types) {
            this.types = Objects.requireNonNull(types);
            return this;
        }
        public Builder types(String... types) {
            return types(List.of(types));
        }
        public GetReferenceResourceTypeResult build() {
            final var o = new GetReferenceResourceTypeResult();
            o.id = id;
            o.types = types;
            return o;
        }
    }
}
