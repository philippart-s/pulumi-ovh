// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.Me.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class APIOAuth2ClientState extends com.pulumi.resources.ResourceArgs {

    public static final APIOAuth2ClientState Empty = new APIOAuth2ClientState();

    /**
     * List of callback urls when configuring the `AUTHORIZATION_CODE` flow.
     * 
     */
    @Import(name="callbackUrls")
    private @Nullable Output<List<String>> callbackUrls;

    /**
     * @return List of callback urls when configuring the `AUTHORIZATION_CODE` flow.
     * 
     */
    public Optional<Output<List<String>>> callbackUrls() {
        return Optional.ofNullable(this.callbackUrls);
    }

    /**
     * Client ID of the created service account.
     * 
     */
    @Import(name="clientId")
    private @Nullable Output<String> clientId;

    /**
     * @return Client ID of the created service account.
     * 
     */
    public Optional<Output<String>> clientId() {
        return Optional.ofNullable(this.clientId);
    }

    /**
     * Client secret of the created service account.
     * 
     */
    @Import(name="clientSecret")
    private @Nullable Output<String> clientSecret;

    /**
     * @return Client secret of the created service account.
     * 
     */
    public Optional<Output<String>> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }

    /**
     * OAuth2 client description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return OAuth2 client description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The OAuth2 flow to use. `AUTHORIZATION_CODE` or `CLIENT_CREDENTIALS` are supported at the moment.
     * 
     */
    @Import(name="flow")
    private @Nullable Output<String> flow;

    /**
     * @return The OAuth2 flow to use. `AUTHORIZATION_CODE` or `CLIENT_CREDENTIALS` are supported at the moment.
     * 
     */
    public Optional<Output<String>> flow() {
        return Optional.ofNullable(this.flow);
    }

    /**
     * URN that will allow you to associate this oauth2 client with an access policy
     * 
     */
    @Import(name="identity")
    private @Nullable Output<String> identity;

    /**
     * @return URN that will allow you to associate this oauth2 client with an access policy
     * 
     */
    public Optional<Output<String>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * OAuth2 client name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return OAuth2 client name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private APIOAuth2ClientState() {}

    private APIOAuth2ClientState(APIOAuth2ClientState $) {
        this.callbackUrls = $.callbackUrls;
        this.clientId = $.clientId;
        this.clientSecret = $.clientSecret;
        this.description = $.description;
        this.flow = $.flow;
        this.identity = $.identity;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(APIOAuth2ClientState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private APIOAuth2ClientState $;

        public Builder() {
            $ = new APIOAuth2ClientState();
        }

        public Builder(APIOAuth2ClientState defaults) {
            $ = new APIOAuth2ClientState(Objects.requireNonNull(defaults));
        }

        /**
         * @param callbackUrls List of callback urls when configuring the `AUTHORIZATION_CODE` flow.
         * 
         * @return builder
         * 
         */
        public Builder callbackUrls(@Nullable Output<List<String>> callbackUrls) {
            $.callbackUrls = callbackUrls;
            return this;
        }

        /**
         * @param callbackUrls List of callback urls when configuring the `AUTHORIZATION_CODE` flow.
         * 
         * @return builder
         * 
         */
        public Builder callbackUrls(List<String> callbackUrls) {
            return callbackUrls(Output.of(callbackUrls));
        }

        /**
         * @param callbackUrls List of callback urls when configuring the `AUTHORIZATION_CODE` flow.
         * 
         * @return builder
         * 
         */
        public Builder callbackUrls(String... callbackUrls) {
            return callbackUrls(List.of(callbackUrls));
        }

        /**
         * @param clientId Client ID of the created service account.
         * 
         * @return builder
         * 
         */
        public Builder clientId(@Nullable Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId Client ID of the created service account.
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param clientSecret Client secret of the created service account.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(@Nullable Output<String> clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        /**
         * @param clientSecret Client secret of the created service account.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(String clientSecret) {
            return clientSecret(Output.of(clientSecret));
        }

        /**
         * @param description OAuth2 client description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description OAuth2 client description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param flow The OAuth2 flow to use. `AUTHORIZATION_CODE` or `CLIENT_CREDENTIALS` are supported at the moment.
         * 
         * @return builder
         * 
         */
        public Builder flow(@Nullable Output<String> flow) {
            $.flow = flow;
            return this;
        }

        /**
         * @param flow The OAuth2 flow to use. `AUTHORIZATION_CODE` or `CLIENT_CREDENTIALS` are supported at the moment.
         * 
         * @return builder
         * 
         */
        public Builder flow(String flow) {
            return flow(Output.of(flow));
        }

        /**
         * @param identity URN that will allow you to associate this oauth2 client with an access policy
         * 
         * @return builder
         * 
         */
        public Builder identity(@Nullable Output<String> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity URN that will allow you to associate this oauth2 client with an access policy
         * 
         * @return builder
         * 
         */
        public Builder identity(String identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param name OAuth2 client name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name OAuth2 client name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public APIOAuth2ClientState build() {
            return $;
        }
    }

}
