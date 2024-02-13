// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.Me.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetIdentityGroupPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIdentityGroupPlainArgs Empty = new GetIdentityGroupPlainArgs();

    /**
     * Group name.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Group name.
     * 
     */
    public String name() {
        return this.name;
    }

    private GetIdentityGroupPlainArgs() {}

    private GetIdentityGroupPlainArgs(GetIdentityGroupPlainArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIdentityGroupPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIdentityGroupPlainArgs $;

        public Builder() {
            $ = new GetIdentityGroupPlainArgs();
        }

        public Builder(GetIdentityGroupPlainArgs defaults) {
            $ = new GetIdentityGroupPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Group name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetIdentityGroupPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
