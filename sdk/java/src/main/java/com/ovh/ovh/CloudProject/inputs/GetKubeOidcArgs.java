// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.CloudProject.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetKubeOidcArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetKubeOidcArgs Empty = new GetKubeOidcArgs();

    /**
     * The OIDC client ID.
     * 
     */
    @Import(name="clientId")
    private @Nullable Output<String> clientId;

    /**
     * @return The OIDC client ID.
     * 
     */
    public Optional<Output<String>> clientId() {
        return Optional.ofNullable(this.clientId);
    }

    /**
     * The OIDC issuer url.
     * 
     */
    @Import(name="issuerUrl")
    private @Nullable Output<String> issuerUrl;

    /**
     * @return The OIDC issuer url.
     * 
     */
    public Optional<Output<String>> issuerUrl() {
        return Optional.ofNullable(this.issuerUrl);
    }

    /**
     * The id of the managed kubernetes cluster.
     * 
     */
    @Import(name="kubeId", required=true)
    private Output<String> kubeId;

    /**
     * @return The id of the managed kubernetes cluster.
     * 
     */
    public Output<String> kubeId() {
        return this.kubeId;
    }

    @Import(name="oidcCaContent")
    private @Nullable Output<String> oidcCaContent;

    public Optional<Output<String>> oidcCaContent() {
        return Optional.ofNullable(this.oidcCaContent);
    }

    @Import(name="oidcGroupsClaims")
    private @Nullable Output<List<String>> oidcGroupsClaims;

    public Optional<Output<List<String>>> oidcGroupsClaims() {
        return Optional.ofNullable(this.oidcGroupsClaims);
    }

    @Import(name="oidcGroupsPrefix")
    private @Nullable Output<String> oidcGroupsPrefix;

    public Optional<Output<String>> oidcGroupsPrefix() {
        return Optional.ofNullable(this.oidcGroupsPrefix);
    }

    @Import(name="oidcRequiredClaims")
    private @Nullable Output<List<String>> oidcRequiredClaims;

    public Optional<Output<List<String>>> oidcRequiredClaims() {
        return Optional.ofNullable(this.oidcRequiredClaims);
    }

    @Import(name="oidcSigningAlgs")
    private @Nullable Output<List<String>> oidcSigningAlgs;

    public Optional<Output<List<String>>> oidcSigningAlgs() {
        return Optional.ofNullable(this.oidcSigningAlgs);
    }

    @Import(name="oidcUsernameClaim")
    private @Nullable Output<String> oidcUsernameClaim;

    public Optional<Output<String>> oidcUsernameClaim() {
        return Optional.ofNullable(this.oidcUsernameClaim);
    }

    @Import(name="oidcUsernamePrefix")
    private @Nullable Output<String> oidcUsernamePrefix;

    public Optional<Output<String>> oidcUsernamePrefix() {
        return Optional.ofNullable(this.oidcUsernamePrefix);
    }

    /**
     * The id of the public cloud project. If omitted,
     * the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    /**
     * @return The id of the public cloud project. If omitted,
     * the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    private GetKubeOidcArgs() {}

    private GetKubeOidcArgs(GetKubeOidcArgs $) {
        this.clientId = $.clientId;
        this.issuerUrl = $.issuerUrl;
        this.kubeId = $.kubeId;
        this.oidcCaContent = $.oidcCaContent;
        this.oidcGroupsClaims = $.oidcGroupsClaims;
        this.oidcGroupsPrefix = $.oidcGroupsPrefix;
        this.oidcRequiredClaims = $.oidcRequiredClaims;
        this.oidcSigningAlgs = $.oidcSigningAlgs;
        this.oidcUsernameClaim = $.oidcUsernameClaim;
        this.oidcUsernamePrefix = $.oidcUsernamePrefix;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetKubeOidcArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetKubeOidcArgs $;

        public Builder() {
            $ = new GetKubeOidcArgs();
        }

        public Builder(GetKubeOidcArgs defaults) {
            $ = new GetKubeOidcArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientId The OIDC client ID.
         * 
         * @return builder
         * 
         */
        public Builder clientId(@Nullable Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId The OIDC client ID.
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param issuerUrl The OIDC issuer url.
         * 
         * @return builder
         * 
         */
        public Builder issuerUrl(@Nullable Output<String> issuerUrl) {
            $.issuerUrl = issuerUrl;
            return this;
        }

        /**
         * @param issuerUrl The OIDC issuer url.
         * 
         * @return builder
         * 
         */
        public Builder issuerUrl(String issuerUrl) {
            return issuerUrl(Output.of(issuerUrl));
        }

        /**
         * @param kubeId The id of the managed kubernetes cluster.
         * 
         * @return builder
         * 
         */
        public Builder kubeId(Output<String> kubeId) {
            $.kubeId = kubeId;
            return this;
        }

        /**
         * @param kubeId The id of the managed kubernetes cluster.
         * 
         * @return builder
         * 
         */
        public Builder kubeId(String kubeId) {
            return kubeId(Output.of(kubeId));
        }

        public Builder oidcCaContent(@Nullable Output<String> oidcCaContent) {
            $.oidcCaContent = oidcCaContent;
            return this;
        }

        public Builder oidcCaContent(String oidcCaContent) {
            return oidcCaContent(Output.of(oidcCaContent));
        }

        public Builder oidcGroupsClaims(@Nullable Output<List<String>> oidcGroupsClaims) {
            $.oidcGroupsClaims = oidcGroupsClaims;
            return this;
        }

        public Builder oidcGroupsClaims(List<String> oidcGroupsClaims) {
            return oidcGroupsClaims(Output.of(oidcGroupsClaims));
        }

        public Builder oidcGroupsClaims(String... oidcGroupsClaims) {
            return oidcGroupsClaims(List.of(oidcGroupsClaims));
        }

        public Builder oidcGroupsPrefix(@Nullable Output<String> oidcGroupsPrefix) {
            $.oidcGroupsPrefix = oidcGroupsPrefix;
            return this;
        }

        public Builder oidcGroupsPrefix(String oidcGroupsPrefix) {
            return oidcGroupsPrefix(Output.of(oidcGroupsPrefix));
        }

        public Builder oidcRequiredClaims(@Nullable Output<List<String>> oidcRequiredClaims) {
            $.oidcRequiredClaims = oidcRequiredClaims;
            return this;
        }

        public Builder oidcRequiredClaims(List<String> oidcRequiredClaims) {
            return oidcRequiredClaims(Output.of(oidcRequiredClaims));
        }

        public Builder oidcRequiredClaims(String... oidcRequiredClaims) {
            return oidcRequiredClaims(List.of(oidcRequiredClaims));
        }

        public Builder oidcSigningAlgs(@Nullable Output<List<String>> oidcSigningAlgs) {
            $.oidcSigningAlgs = oidcSigningAlgs;
            return this;
        }

        public Builder oidcSigningAlgs(List<String> oidcSigningAlgs) {
            return oidcSigningAlgs(Output.of(oidcSigningAlgs));
        }

        public Builder oidcSigningAlgs(String... oidcSigningAlgs) {
            return oidcSigningAlgs(List.of(oidcSigningAlgs));
        }

        public Builder oidcUsernameClaim(@Nullable Output<String> oidcUsernameClaim) {
            $.oidcUsernameClaim = oidcUsernameClaim;
            return this;
        }

        public Builder oidcUsernameClaim(String oidcUsernameClaim) {
            return oidcUsernameClaim(Output.of(oidcUsernameClaim));
        }

        public Builder oidcUsernamePrefix(@Nullable Output<String> oidcUsernamePrefix) {
            $.oidcUsernamePrefix = oidcUsernamePrefix;
            return this;
        }

        public Builder oidcUsernamePrefix(String oidcUsernamePrefix) {
            return oidcUsernamePrefix(Output.of(oidcUsernamePrefix));
        }

        /**
         * @param serviceName The id of the public cloud project. If omitted,
         * the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The id of the public cloud project. If omitted,
         * the `OVH_CLOUD_PROJECT_SERVICE` environment variable is used.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public GetKubeOidcArgs build() {
            $.kubeId = Objects.requireNonNull($.kubeId, "expected parameter 'kubeId' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
