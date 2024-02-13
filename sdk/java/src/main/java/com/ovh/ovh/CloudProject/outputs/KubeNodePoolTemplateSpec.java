// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.CloudProject.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class KubeNodePoolTemplateSpec {
    /**
     * @return Taints to apply to each node
     * 
     */
    private List<Map<String,Object>> taints;
    /**
     * @return If true, set nodes as un-schedulable
     * 
     */
    private Boolean unschedulable;

    private KubeNodePoolTemplateSpec() {}
    /**
     * @return Taints to apply to each node
     * 
     */
    public List<Map<String,Object>> taints() {
        return this.taints;
    }
    /**
     * @return If true, set nodes as un-schedulable
     * 
     */
    public Boolean unschedulable() {
        return this.unschedulable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubeNodePoolTemplateSpec defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<Map<String,Object>> taints;
        private Boolean unschedulable;
        public Builder() {}
        public Builder(KubeNodePoolTemplateSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.taints = defaults.taints;
    	      this.unschedulable = defaults.unschedulable;
        }

        @CustomType.Setter
        public Builder taints(List<Map<String,Object>> taints) {
            this.taints = Objects.requireNonNull(taints);
            return this;
        }
        @CustomType.Setter
        public Builder unschedulable(Boolean unschedulable) {
            this.unschedulable = Objects.requireNonNull(unschedulable);
            return this;
        }
        public KubeNodePoolTemplateSpec build() {
            final var o = new KubeNodePoolTemplateSpec();
            o.taints = taints;
            o.unschedulable = unschedulable;
            return o;
        }
    }
}
