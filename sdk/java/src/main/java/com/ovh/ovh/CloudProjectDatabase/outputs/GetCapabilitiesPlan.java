// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.CloudProjectDatabase.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCapabilitiesPlan {
    /**
     * @return Automatic backup retention duration.
     * 
     */
    private String backupRetention;
    /**
     * @return Description of the plan.
     * 
     */
    private String description;
    /**
     * @return Name of the plan.
     * 
     */
    private String name;

    private GetCapabilitiesPlan() {}
    /**
     * @return Automatic backup retention duration.
     * 
     */
    public String backupRetention() {
        return this.backupRetention;
    }
    /**
     * @return Description of the plan.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Name of the plan.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCapabilitiesPlan defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String backupRetention;
        private String description;
        private String name;
        public Builder() {}
        public Builder(GetCapabilitiesPlan defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupRetention = defaults.backupRetention;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder backupRetention(String backupRetention) {
            this.backupRetention = Objects.requireNonNull(backupRetention);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetCapabilitiesPlan build() {
            final var o = new GetCapabilitiesPlan();
            o.backupRetention = backupRetention;
            o.description = description;
            o.name = name;
            return o;
        }
    }
}
