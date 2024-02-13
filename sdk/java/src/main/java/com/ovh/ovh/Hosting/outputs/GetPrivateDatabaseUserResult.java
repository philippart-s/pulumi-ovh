// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.Hosting.outputs;

import com.ovh.ovh.Hosting.outputs.GetPrivateDatabaseUserDatabase;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetPrivateDatabaseUserResult {
    /**
     * @return Creation date of the database
     * 
     */
    private String creationDate;
    /**
     * @return Users granted to this database
     * 
     */
    private List<GetPrivateDatabaseUserDatabase> databases;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String serviceName;
    private String userName;

    private GetPrivateDatabaseUserResult() {}
    /**
     * @return Creation date of the database
     * 
     */
    public String creationDate() {
        return this.creationDate;
    }
    /**
     * @return Users granted to this database
     * 
     */
    public List<GetPrivateDatabaseUserDatabase> databases() {
        return this.databases;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String serviceName() {
        return this.serviceName;
    }
    public String userName() {
        return this.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivateDatabaseUserResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String creationDate;
        private List<GetPrivateDatabaseUserDatabase> databases;
        private String id;
        private String serviceName;
        private String userName;
        public Builder() {}
        public Builder(GetPrivateDatabaseUserResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationDate = defaults.creationDate;
    	      this.databases = defaults.databases;
    	      this.id = defaults.id;
    	      this.serviceName = defaults.serviceName;
    	      this.userName = defaults.userName;
        }

        @CustomType.Setter
        public Builder creationDate(String creationDate) {
            this.creationDate = Objects.requireNonNull(creationDate);
            return this;
        }
        @CustomType.Setter
        public Builder databases(List<GetPrivateDatabaseUserDatabase> databases) {
            this.databases = Objects.requireNonNull(databases);
            return this;
        }
        public Builder databases(GetPrivateDatabaseUserDatabase... databases) {
            return databases(List.of(databases));
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
        @CustomType.Setter
        public Builder userName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }
        public GetPrivateDatabaseUserResult build() {
            final var o = new GetPrivateDatabaseUserResult();
            o.creationDate = creationDate;
            o.databases = databases;
            o.id = id;
            o.serviceName = serviceName;
            o.userName = userName;
            return o;
        }
    }
}
