// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.Hosting.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPrivateDatabaseAllowlistResult {
    /**
     * @return Creation date of the database
     * 
     */
    private String creationDate;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable String ip;
    /**
     * @return The last update date of this whitelist
     * 
     */
    private String lastUpdate;
    /**
     * @return Custom name for your Whitelisted IP
     * 
     */
    private String name;
    /**
     * @return Authorize this IP to access service port
     * 
     */
    private Boolean service;
    private String serviceName;
    /**
     * @return Authorize this IP to access SFTP port
     * 
     */
    private Boolean sftp;
    /**
     * @return Whitelist status
     * 
     */
    private String status;

    private GetPrivateDatabaseAllowlistResult() {}
    /**
     * @return Creation date of the database
     * 
     */
    public String creationDate() {
        return this.creationDate;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<String> ip() {
        return Optional.ofNullable(this.ip);
    }
    /**
     * @return The last update date of this whitelist
     * 
     */
    public String lastUpdate() {
        return this.lastUpdate;
    }
    /**
     * @return Custom name for your Whitelisted IP
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Authorize this IP to access service port
     * 
     */
    public Boolean service() {
        return this.service;
    }
    public String serviceName() {
        return this.serviceName;
    }
    /**
     * @return Authorize this IP to access SFTP port
     * 
     */
    public Boolean sftp() {
        return this.sftp;
    }
    /**
     * @return Whitelist status
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivateDatabaseAllowlistResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String creationDate;
        private String id;
        private @Nullable String ip;
        private String lastUpdate;
        private String name;
        private Boolean service;
        private String serviceName;
        private Boolean sftp;
        private String status;
        public Builder() {}
        public Builder(GetPrivateDatabaseAllowlistResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationDate = defaults.creationDate;
    	      this.id = defaults.id;
    	      this.ip = defaults.ip;
    	      this.lastUpdate = defaults.lastUpdate;
    	      this.name = defaults.name;
    	      this.service = defaults.service;
    	      this.serviceName = defaults.serviceName;
    	      this.sftp = defaults.sftp;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder creationDate(String creationDate) {
            this.creationDate = Objects.requireNonNull(creationDate);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ip(@Nullable String ip) {
            this.ip = ip;
            return this;
        }
        @CustomType.Setter
        public Builder lastUpdate(String lastUpdate) {
            this.lastUpdate = Objects.requireNonNull(lastUpdate);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder service(Boolean service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }
        @CustomType.Setter
        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        @CustomType.Setter
        public Builder sftp(Boolean sftp) {
            this.sftp = Objects.requireNonNull(sftp);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public GetPrivateDatabaseAllowlistResult build() {
            final var o = new GetPrivateDatabaseAllowlistResult();
            o.creationDate = creationDate;
            o.id = id;
            o.ip = ip;
            o.lastUpdate = lastUpdate;
            o.name = name;
            o.service = service;
            o.serviceName = serviceName;
            o.sftp = sftp;
            o.status = status;
            return o;
        }
    }
}
