// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.Hosting.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPrivateDatabaseArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPrivateDatabaseArgs Empty = new GetPrivateDatabaseArgs();

    /**
     * The internal name of your private database
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    /**
     * @return The internal name of your private database
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    private GetPrivateDatabaseArgs() {}

    private GetPrivateDatabaseArgs(GetPrivateDatabaseArgs $) {
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPrivateDatabaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPrivateDatabaseArgs $;

        public Builder() {
            $ = new GetPrivateDatabaseArgs();
        }

        public Builder(GetPrivateDatabaseArgs defaults) {
            $ = new GetPrivateDatabaseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param serviceName The internal name of your private database
         * 
         * @return builder
         * 
         */
        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The internal name of your private database
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public GetPrivateDatabaseArgs build() {
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
