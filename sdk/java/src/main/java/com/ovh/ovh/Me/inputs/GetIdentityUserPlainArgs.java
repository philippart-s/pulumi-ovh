// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.Me.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetIdentityUserPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIdentityUserPlainArgs Empty = new GetIdentityUserPlainArgs();

    /**
     * User&#39;s login.
     * 
     */
    @Import(name="user", required=true)
    private String user;

    /**
     * @return User&#39;s login.
     * 
     */
    public String user() {
        return this.user;
    }

    private GetIdentityUserPlainArgs() {}

    private GetIdentityUserPlainArgs(GetIdentityUserPlainArgs $) {
        this.user = $.user;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIdentityUserPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIdentityUserPlainArgs $;

        public Builder() {
            $ = new GetIdentityUserPlainArgs();
        }

        public Builder(GetIdentityUserPlainArgs defaults) {
            $ = new GetIdentityUserPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param user User&#39;s login.
         * 
         * @return builder
         * 
         */
        public Builder user(String user) {
            $.user = user;
            return this;
        }

        public GetIdentityUserPlainArgs build() {
            $.user = Objects.requireNonNull($.user, "expected parameter 'user' to be non-null");
            return $;
        }
    }

}
