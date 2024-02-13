// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.CloudProject.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetKubeCustomizationKubeProxyIpvsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetKubeCustomizationKubeProxyIpvsArgs Empty = new GetKubeCustomizationKubeProxyIpvsArgs();

    /**
     * Minimum period that IPVS rules are refreshed in [RFC3339](https://www.rfc-editor.org/rfc/rfc3339) duration.
     * 
     */
    @Import(name="minSyncPeriod")
    private @Nullable Output<String> minSyncPeriod;

    /**
     * @return Minimum period that IPVS rules are refreshed in [RFC3339](https://www.rfc-editor.org/rfc/rfc3339) duration.
     * 
     */
    public Optional<Output<String>> minSyncPeriod() {
        return Optional.ofNullable(this.minSyncPeriod);
    }

    /**
     * IPVS scheduler.
     * 
     */
    @Import(name="scheduler")
    private @Nullable Output<String> scheduler;

    /**
     * @return IPVS scheduler.
     * 
     */
    public Optional<Output<String>> scheduler() {
        return Optional.ofNullable(this.scheduler);
    }

    /**
     * Minimum period that IPVS rules are refreshed, in [RFC3339](https://www.rfc-editor.org/rfc/rfc3339) duration format.
     * 
     */
    @Import(name="syncPeriod")
    private @Nullable Output<String> syncPeriod;

    /**
     * @return Minimum period that IPVS rules are refreshed, in [RFC3339](https://www.rfc-editor.org/rfc/rfc3339) duration format.
     * 
     */
    public Optional<Output<String>> syncPeriod() {
        return Optional.ofNullable(this.syncPeriod);
    }

    /**
     * Timeout value used for IPVS TCP sessions after receiving a FIN in RFC3339 duration.
     * 
     */
    @Import(name="tcpFinTimeout")
    private @Nullable Output<String> tcpFinTimeout;

    /**
     * @return Timeout value used for IPVS TCP sessions after receiving a FIN in RFC3339 duration.
     * 
     */
    public Optional<Output<String>> tcpFinTimeout() {
        return Optional.ofNullable(this.tcpFinTimeout);
    }

    /**
     * Timeout value used for idle IPVS TCP sessions in [RFC3339](https://www.rfc-editor.org/rfc/rfc3339) duration.
     * 
     */
    @Import(name="tcpTimeout")
    private @Nullable Output<String> tcpTimeout;

    /**
     * @return Timeout value used for idle IPVS TCP sessions in [RFC3339](https://www.rfc-editor.org/rfc/rfc3339) duration.
     * 
     */
    public Optional<Output<String>> tcpTimeout() {
        return Optional.ofNullable(this.tcpTimeout);
    }

    /**
     * timeout value used for IPVS UDP packets in [RFC3339](https://www.rfc-editor.org/rfc/rfc3339) duration.
     * 
     */
    @Import(name="udpTimeout")
    private @Nullable Output<String> udpTimeout;

    /**
     * @return timeout value used for IPVS UDP packets in [RFC3339](https://www.rfc-editor.org/rfc/rfc3339) duration.
     * 
     */
    public Optional<Output<String>> udpTimeout() {
        return Optional.ofNullable(this.udpTimeout);
    }

    private GetKubeCustomizationKubeProxyIpvsArgs() {}

    private GetKubeCustomizationKubeProxyIpvsArgs(GetKubeCustomizationKubeProxyIpvsArgs $) {
        this.minSyncPeriod = $.minSyncPeriod;
        this.scheduler = $.scheduler;
        this.syncPeriod = $.syncPeriod;
        this.tcpFinTimeout = $.tcpFinTimeout;
        this.tcpTimeout = $.tcpTimeout;
        this.udpTimeout = $.udpTimeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetKubeCustomizationKubeProxyIpvsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetKubeCustomizationKubeProxyIpvsArgs $;

        public Builder() {
            $ = new GetKubeCustomizationKubeProxyIpvsArgs();
        }

        public Builder(GetKubeCustomizationKubeProxyIpvsArgs defaults) {
            $ = new GetKubeCustomizationKubeProxyIpvsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param minSyncPeriod Minimum period that IPVS rules are refreshed in [RFC3339](https://www.rfc-editor.org/rfc/rfc3339) duration.
         * 
         * @return builder
         * 
         */
        public Builder minSyncPeriod(@Nullable Output<String> minSyncPeriod) {
            $.minSyncPeriod = minSyncPeriod;
            return this;
        }

        /**
         * @param minSyncPeriod Minimum period that IPVS rules are refreshed in [RFC3339](https://www.rfc-editor.org/rfc/rfc3339) duration.
         * 
         * @return builder
         * 
         */
        public Builder minSyncPeriod(String minSyncPeriod) {
            return minSyncPeriod(Output.of(minSyncPeriod));
        }

        /**
         * @param scheduler IPVS scheduler.
         * 
         * @return builder
         * 
         */
        public Builder scheduler(@Nullable Output<String> scheduler) {
            $.scheduler = scheduler;
            return this;
        }

        /**
         * @param scheduler IPVS scheduler.
         * 
         * @return builder
         * 
         */
        public Builder scheduler(String scheduler) {
            return scheduler(Output.of(scheduler));
        }

        /**
         * @param syncPeriod Minimum period that IPVS rules are refreshed, in [RFC3339](https://www.rfc-editor.org/rfc/rfc3339) duration format.
         * 
         * @return builder
         * 
         */
        public Builder syncPeriod(@Nullable Output<String> syncPeriod) {
            $.syncPeriod = syncPeriod;
            return this;
        }

        /**
         * @param syncPeriod Minimum period that IPVS rules are refreshed, in [RFC3339](https://www.rfc-editor.org/rfc/rfc3339) duration format.
         * 
         * @return builder
         * 
         */
        public Builder syncPeriod(String syncPeriod) {
            return syncPeriod(Output.of(syncPeriod));
        }

        /**
         * @param tcpFinTimeout Timeout value used for IPVS TCP sessions after receiving a FIN in RFC3339 duration.
         * 
         * @return builder
         * 
         */
        public Builder tcpFinTimeout(@Nullable Output<String> tcpFinTimeout) {
            $.tcpFinTimeout = tcpFinTimeout;
            return this;
        }

        /**
         * @param tcpFinTimeout Timeout value used for IPVS TCP sessions after receiving a FIN in RFC3339 duration.
         * 
         * @return builder
         * 
         */
        public Builder tcpFinTimeout(String tcpFinTimeout) {
            return tcpFinTimeout(Output.of(tcpFinTimeout));
        }

        /**
         * @param tcpTimeout Timeout value used for idle IPVS TCP sessions in [RFC3339](https://www.rfc-editor.org/rfc/rfc3339) duration.
         * 
         * @return builder
         * 
         */
        public Builder tcpTimeout(@Nullable Output<String> tcpTimeout) {
            $.tcpTimeout = tcpTimeout;
            return this;
        }

        /**
         * @param tcpTimeout Timeout value used for idle IPVS TCP sessions in [RFC3339](https://www.rfc-editor.org/rfc/rfc3339) duration.
         * 
         * @return builder
         * 
         */
        public Builder tcpTimeout(String tcpTimeout) {
            return tcpTimeout(Output.of(tcpTimeout));
        }

        /**
         * @param udpTimeout timeout value used for IPVS UDP packets in [RFC3339](https://www.rfc-editor.org/rfc/rfc3339) duration.
         * 
         * @return builder
         * 
         */
        public Builder udpTimeout(@Nullable Output<String> udpTimeout) {
            $.udpTimeout = udpTimeout;
            return this;
        }

        /**
         * @param udpTimeout timeout value used for IPVS UDP packets in [RFC3339](https://www.rfc-editor.org/rfc/rfc3339) duration.
         * 
         * @return builder
         * 
         */
        public Builder udpTimeout(String udpTimeout) {
            return udpTimeout(Output.of(udpTimeout));
        }

        public GetKubeCustomizationKubeProxyIpvsArgs build() {
            return $;
        }
    }

}
