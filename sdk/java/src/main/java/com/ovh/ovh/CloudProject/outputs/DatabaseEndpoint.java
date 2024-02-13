// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.CloudProject.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatabaseEndpoint {
    /**
     * @return Type of component the URI relates to.
     * 
     */
    private @Nullable String component;
    /**
     * @return Domain of the cluster.
     * 
     */
    private @Nullable String domain;
    /**
     * @return Path of the endpoint.
     * 
     */
    private @Nullable String path;
    /**
     * @return Connection port for the endpoint.
     * 
     */
    private @Nullable Integer port;
    /**
     * @return Scheme used to generate the URI.
     * 
     */
    private @Nullable String scheme;
    /**
     * @return Defines whether the endpoint uses SSL.
     * 
     */
    private @Nullable Boolean ssl;
    /**
     * @return SSL mode used to connect to the service if the SSL is enabled.
     * 
     */
    private @Nullable String sslMode;
    /**
     * @return URI of the endpoint.
     * 
     */
    private @Nullable String uri;

    private DatabaseEndpoint() {}
    /**
     * @return Type of component the URI relates to.
     * 
     */
    public Optional<String> component() {
        return Optional.ofNullable(this.component);
    }
    /**
     * @return Domain of the cluster.
     * 
     */
    public Optional<String> domain() {
        return Optional.ofNullable(this.domain);
    }
    /**
     * @return Path of the endpoint.
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    /**
     * @return Connection port for the endpoint.
     * 
     */
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * @return Scheme used to generate the URI.
     * 
     */
    public Optional<String> scheme() {
        return Optional.ofNullable(this.scheme);
    }
    /**
     * @return Defines whether the endpoint uses SSL.
     * 
     */
    public Optional<Boolean> ssl() {
        return Optional.ofNullable(this.ssl);
    }
    /**
     * @return SSL mode used to connect to the service if the SSL is enabled.
     * 
     */
    public Optional<String> sslMode() {
        return Optional.ofNullable(this.sslMode);
    }
    /**
     * @return URI of the endpoint.
     * 
     */
    public Optional<String> uri() {
        return Optional.ofNullable(this.uri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseEndpoint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String component;
        private @Nullable String domain;
        private @Nullable String path;
        private @Nullable Integer port;
        private @Nullable String scheme;
        private @Nullable Boolean ssl;
        private @Nullable String sslMode;
        private @Nullable String uri;
        public Builder() {}
        public Builder(DatabaseEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.component = defaults.component;
    	      this.domain = defaults.domain;
    	      this.path = defaults.path;
    	      this.port = defaults.port;
    	      this.scheme = defaults.scheme;
    	      this.ssl = defaults.ssl;
    	      this.sslMode = defaults.sslMode;
    	      this.uri = defaults.uri;
        }

        @CustomType.Setter
        public Builder component(@Nullable String component) {
            this.component = component;
            return this;
        }
        @CustomType.Setter
        public Builder domain(@Nullable String domain) {
            this.domain = domain;
            return this;
        }
        @CustomType.Setter
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder port(@Nullable Integer port) {
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder scheme(@Nullable String scheme) {
            this.scheme = scheme;
            return this;
        }
        @CustomType.Setter
        public Builder ssl(@Nullable Boolean ssl) {
            this.ssl = ssl;
            return this;
        }
        @CustomType.Setter
        public Builder sslMode(@Nullable String sslMode) {
            this.sslMode = sslMode;
            return this;
        }
        @CustomType.Setter
        public Builder uri(@Nullable String uri) {
            this.uri = uri;
            return this;
        }
        public DatabaseEndpoint build() {
            final var o = new DatabaseEndpoint();
            o.component = component;
            o.domain = domain;
            o.path = path;
            o.port = port;
            o.scheme = scheme;
            o.ssl = ssl;
            o.sslMode = sslMode;
            o.uri = uri;
            return o;
        }
    }
}
