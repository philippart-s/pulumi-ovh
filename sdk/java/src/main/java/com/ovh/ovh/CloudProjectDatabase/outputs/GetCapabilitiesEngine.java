// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.CloudProjectDatabase.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetCapabilitiesEngine {
    /**
     * @return Default version used for the engine.
     * 
     */
    private String defaultVersion;
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
    /**
     * @return SSL modes for this engine.
     * 
     */
    private List<String> sslModes;
    /**
     * @return Versions available for this engine.
     * 
     */
    private List<String> versions;

    private GetCapabilitiesEngine() {}
    /**
     * @return Default version used for the engine.
     * 
     */
    public String defaultVersion() {
        return this.defaultVersion;
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
    /**
     * @return SSL modes for this engine.
     * 
     */
    public List<String> sslModes() {
        return this.sslModes;
    }
    /**
     * @return Versions available for this engine.
     * 
     */
    public List<String> versions() {
        return this.versions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCapabilitiesEngine defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String defaultVersion;
        private String description;
        private String name;
        private List<String> sslModes;
        private List<String> versions;
        public Builder() {}
        public Builder(GetCapabilitiesEngine defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultVersion = defaults.defaultVersion;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.sslModes = defaults.sslModes;
    	      this.versions = defaults.versions;
        }

        @CustomType.Setter
        public Builder defaultVersion(String defaultVersion) {
            this.defaultVersion = Objects.requireNonNull(defaultVersion);
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
        @CustomType.Setter
        public Builder sslModes(List<String> sslModes) {
            this.sslModes = Objects.requireNonNull(sslModes);
            return this;
        }
        public Builder sslModes(String... sslModes) {
            return sslModes(List.of(sslModes));
        }
        @CustomType.Setter
        public Builder versions(List<String> versions) {
            this.versions = Objects.requireNonNull(versions);
            return this;
        }
        public Builder versions(String... versions) {
            return versions(List.of(versions));
        }
        public GetCapabilitiesEngine build() {
            final var o = new GetCapabilitiesEngine();
            o.defaultVersion = defaultVersion;
            o.description = description;
            o.name = name;
            o.sslModes = sslModes;
            o.versions = versions;
            return o;
        }
    }
}
