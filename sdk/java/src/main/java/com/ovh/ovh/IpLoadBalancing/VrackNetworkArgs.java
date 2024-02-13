// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.IpLoadBalancing;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VrackNetworkArgs extends com.pulumi.resources.ResourceArgs {

    public static final VrackNetworkArgs Empty = new VrackNetworkArgs();

    /**
     * Human readable name for your vrack network
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return Human readable name for your vrack network
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * This attribute is there for documentation purpose only and isnt passed to the OVHcloud API as it may conflicts with http/tcp farms `vrack_network_id` attribute
     * 
     */
    @Import(name="farmIds")
    private @Nullable Output<List<Integer>> farmIds;

    /**
     * @return This attribute is there for documentation purpose only and isnt passed to the OVHcloud API as it may conflicts with http/tcp farms `vrack_network_id` attribute
     * 
     */
    public Optional<Output<List<Integer>>> farmIds() {
        return Optional.ofNullable(this.farmIds);
    }

    /**
     * An IP block used as a pool of IPs by this Load Balancer to connect to the servers in this private network. The blck must be in the private network and reserved for the Load Balancer
     * 
     */
    @Import(name="natIp", required=true)
    private Output<String> natIp;

    /**
     * @return An IP block used as a pool of IPs by this Load Balancer to connect to the servers in this private network. The blck must be in the private network and reserved for the Load Balancer
     * 
     */
    public Output<String> natIp() {
        return this.natIp;
    }

    /**
     * The internal name of your IP load balancing
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    /**
     * @return The internal name of your IP load balancing
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    /**
     * IP block of the private network in the vRack
     * 
     */
    @Import(name="subnet", required=true)
    private Output<String> subnet;

    /**
     * @return IP block of the private network in the vRack
     * 
     */
    public Output<String> subnet() {
        return this.subnet;
    }

    /**
     * VLAN of the private network in the vRack. 0 if the private network is not in a VLAN
     * 
     */
    @Import(name="vlan")
    private @Nullable Output<Integer> vlan;

    /**
     * @return VLAN of the private network in the vRack. 0 if the private network is not in a VLAN
     * 
     */
    public Optional<Output<Integer>> vlan() {
        return Optional.ofNullable(this.vlan);
    }

    private VrackNetworkArgs() {}

    private VrackNetworkArgs(VrackNetworkArgs $) {
        this.displayName = $.displayName;
        this.farmIds = $.farmIds;
        this.natIp = $.natIp;
        this.serviceName = $.serviceName;
        this.subnet = $.subnet;
        this.vlan = $.vlan;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VrackNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VrackNetworkArgs $;

        public Builder() {
            $ = new VrackNetworkArgs();
        }

        public Builder(VrackNetworkArgs defaults) {
            $ = new VrackNetworkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param displayName Human readable name for your vrack network
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Human readable name for your vrack network
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param farmIds This attribute is there for documentation purpose only and isnt passed to the OVHcloud API as it may conflicts with http/tcp farms `vrack_network_id` attribute
         * 
         * @return builder
         * 
         */
        public Builder farmIds(@Nullable Output<List<Integer>> farmIds) {
            $.farmIds = farmIds;
            return this;
        }

        /**
         * @param farmIds This attribute is there for documentation purpose only and isnt passed to the OVHcloud API as it may conflicts with http/tcp farms `vrack_network_id` attribute
         * 
         * @return builder
         * 
         */
        public Builder farmIds(List<Integer> farmIds) {
            return farmIds(Output.of(farmIds));
        }

        /**
         * @param farmIds This attribute is there for documentation purpose only and isnt passed to the OVHcloud API as it may conflicts with http/tcp farms `vrack_network_id` attribute
         * 
         * @return builder
         * 
         */
        public Builder farmIds(Integer... farmIds) {
            return farmIds(List.of(farmIds));
        }

        /**
         * @param natIp An IP block used as a pool of IPs by this Load Balancer to connect to the servers in this private network. The blck must be in the private network and reserved for the Load Balancer
         * 
         * @return builder
         * 
         */
        public Builder natIp(Output<String> natIp) {
            $.natIp = natIp;
            return this;
        }

        /**
         * @param natIp An IP block used as a pool of IPs by this Load Balancer to connect to the servers in this private network. The blck must be in the private network and reserved for the Load Balancer
         * 
         * @return builder
         * 
         */
        public Builder natIp(String natIp) {
            return natIp(Output.of(natIp));
        }

        /**
         * @param serviceName The internal name of your IP load balancing
         * 
         * @return builder
         * 
         */
        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The internal name of your IP load balancing
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        /**
         * @param subnet IP block of the private network in the vRack
         * 
         * @return builder
         * 
         */
        public Builder subnet(Output<String> subnet) {
            $.subnet = subnet;
            return this;
        }

        /**
         * @param subnet IP block of the private network in the vRack
         * 
         * @return builder
         * 
         */
        public Builder subnet(String subnet) {
            return subnet(Output.of(subnet));
        }

        /**
         * @param vlan VLAN of the private network in the vRack. 0 if the private network is not in a VLAN
         * 
         * @return builder
         * 
         */
        public Builder vlan(@Nullable Output<Integer> vlan) {
            $.vlan = vlan;
            return this;
        }

        /**
         * @param vlan VLAN of the private network in the vRack. 0 if the private network is not in a VLAN
         * 
         * @return builder
         * 
         */
        public Builder vlan(Integer vlan) {
            return vlan(Output.of(vlan));
        }

        public VrackNetworkArgs build() {
            $.natIp = Objects.requireNonNull($.natIp, "expected parameter 'natIp' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            $.subnet = Objects.requireNonNull($.subnet, "expected parameter 'subnet' to be non-null");
            return $;
        }
    }

}
