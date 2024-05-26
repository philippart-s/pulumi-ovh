// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.Me.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetIdentityUserArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIdentityUserArgs Empty = new GetIdentityUserArgs();

    /**
     * User&#39;s login.
     * 
     */
    @Import(name="user", required=true)
    private Output<String> user;

    /**
     * @return User&#39;s login.
     * 
     */
    public Output<String> user() {
        return this.user;
    }

    private GetIdentityUserArgs() {}

    private GetIdentityUserArgs(GetIdentityUserArgs $) {
        this.user = $.user;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIdentityUserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIdentityUserArgs $;

        public Builder() {
            $ = new GetIdentityUserArgs();
        }

        public Builder(GetIdentityUserArgs defaults) {
            $ = new GetIdentityUserArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param user User&#39;s login.
         * 
         * @return builder
         * 
         */
        public Builder user(Output<String> user) {
            $.user = user;
            return this;
        }

        /**
         * @param user User&#39;s login.
         * 
         * @return builder
         * 
         */
        public Builder user(String user) {
            return user(Output.of(user));
        }

        public GetIdentityUserArgs build() {
            if ($.user == null) {
                throw new MissingRequiredPropertyException("GetIdentityUserArgs", "user");
            }
            return $;
        }
    }

}