// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.CloudProjectDatabase.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCapabilitiesOption {
    /**
     * @return Name of the plan.
     * 
     */
    private String name;
    /**
     * @return Type of the option.
     * 
     */
    private String type;

    private GetCapabilitiesOption() {}
    /**
     * @return Name of the plan.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Type of the option.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCapabilitiesOption defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String type;
        public Builder() {}
        public Builder(GetCapabilitiesOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetCapabilitiesOption build() {
            final var o = new GetCapabilitiesOption();
            o.name = name;
            o.type = type;
            return o;
        }
    }
}
