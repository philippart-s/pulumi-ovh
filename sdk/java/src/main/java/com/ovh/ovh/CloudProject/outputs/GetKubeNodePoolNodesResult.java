// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.CloudProject.outputs;

import com.ovh.ovh.CloudProject.outputs.GetKubeNodePoolNodesNode;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetKubeNodePoolNodesResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return See Argument Reference above.
     * 
     */
    private String kubeId;
    /**
     * @return Name of the node.
     * 
     */
    private String name;
    /**
     * @return List of all nodes composing the kubernetes cluster.
     * 
     */
    private List<GetKubeNodePoolNodesNode> nodes;
    /**
     * @return See Argument Reference above.
     * 
     */
    private String serviceName;

    private GetKubeNodePoolNodesResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return See Argument Reference above.
     * 
     */
    public String kubeId() {
        return this.kubeId;
    }
    /**
     * @return Name of the node.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return List of all nodes composing the kubernetes cluster.
     * 
     */
    public List<GetKubeNodePoolNodesNode> nodes() {
        return this.nodes;
    }
    /**
     * @return See Argument Reference above.
     * 
     */
    public String serviceName() {
        return this.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKubeNodePoolNodesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String kubeId;
        private String name;
        private List<GetKubeNodePoolNodesNode> nodes;
        private String serviceName;
        public Builder() {}
        public Builder(GetKubeNodePoolNodesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.kubeId = defaults.kubeId;
    	      this.name = defaults.name;
    	      this.nodes = defaults.nodes;
    	      this.serviceName = defaults.serviceName;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder kubeId(String kubeId) {
            this.kubeId = Objects.requireNonNull(kubeId);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder nodes(List<GetKubeNodePoolNodesNode> nodes) {
            this.nodes = Objects.requireNonNull(nodes);
            return this;
        }
        public Builder nodes(GetKubeNodePoolNodesNode... nodes) {
            return nodes(List.of(nodes));
        }
        @CustomType.Setter
        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public GetKubeNodePoolNodesResult build() {
            final var o = new GetKubeNodePoolNodesResult();
            o.id = id;
            o.kubeId = kubeId;
            o.name = name;
            o.nodes = nodes;
            o.serviceName = serviceName;
            return o;
        }
    }
}
