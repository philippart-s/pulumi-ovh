// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.Hosting.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPrivateDatabaseUserGrantPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPrivateDatabaseUserGrantPlainArgs Empty = new GetPrivateDatabaseUserGrantPlainArgs();

    /**
     * The database name on which grant the user
     * 
     */
    @Import(name="databaseName", required=true)
    private String databaseName;

    /**
     * @return The database name on which grant the user
     * 
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * The internal name of your private database
     * 
     */
    @Import(name="serviceName", required=true)
    private String serviceName;

    /**
     * @return The internal name of your private database
     * 
     */
    public String serviceName() {
        return this.serviceName;
    }

    /**
     * The user name
     * 
     */
    @Import(name="userName", required=true)
    private String userName;

    /**
     * @return The user name
     * 
     */
    public String userName() {
        return this.userName;
    }

    private GetPrivateDatabaseUserGrantPlainArgs() {}

    private GetPrivateDatabaseUserGrantPlainArgs(GetPrivateDatabaseUserGrantPlainArgs $) {
        this.databaseName = $.databaseName;
        this.serviceName = $.serviceName;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPrivateDatabaseUserGrantPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPrivateDatabaseUserGrantPlainArgs $;

        public Builder() {
            $ = new GetPrivateDatabaseUserGrantPlainArgs();
        }

        public Builder(GetPrivateDatabaseUserGrantPlainArgs defaults) {
            $ = new GetPrivateDatabaseUserGrantPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param databaseName The database name on which grant the user
         * 
         * @return builder
         * 
         */
        public Builder databaseName(String databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        /**
         * @param serviceName The internal name of your private database
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param userName The user name
         * 
         * @return builder
         * 
         */
        public Builder userName(String userName) {
            $.userName = userName;
            return this;
        }

        public GetPrivateDatabaseUserGrantPlainArgs build() {
            $.databaseName = Objects.requireNonNull($.databaseName, "expected parameter 'databaseName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            $.userName = Objects.requireNonNull($.userName, "expected parameter 'userName' to be non-null");
            return $;
        }
    }

}
