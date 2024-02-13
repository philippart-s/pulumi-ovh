// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.CloudProject.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


public final class KubeNodePoolTemplateMetadataArgs extends com.pulumi.resources.ResourceArgs {

    public static final KubeNodePoolTemplateMetadataArgs Empty = new KubeNodePoolTemplateMetadataArgs();

    /**
     * Annotations to apply to each node
     * 
     */
    @Import(name="annotations", required=true)
    private Output<Map<String,String>> annotations;

    /**
     * @return Annotations to apply to each node
     * 
     */
    public Output<Map<String,String>> annotations() {
        return this.annotations;
    }

    /**
     * Finalizers to apply to each node. A finalizer name must be fully qualified, e.g. kubernetes.io/pv-protection , where you prefix it with hostname of your service which is related to the controller responsible for the finalizer.
     * 
     */
    @Import(name="finalizers", required=true)
    private Output<List<String>> finalizers;

    /**
     * @return Finalizers to apply to each node. A finalizer name must be fully qualified, e.g. kubernetes.io/pv-protection , where you prefix it with hostname of your service which is related to the controller responsible for the finalizer.
     * 
     */
    public Output<List<String>> finalizers() {
        return this.finalizers;
    }

    /**
     * Labels to apply to each node
     * 
     */
    @Import(name="labels", required=true)
    private Output<Map<String,String>> labels;

    /**
     * @return Labels to apply to each node
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }

    private KubeNodePoolTemplateMetadataArgs() {}

    private KubeNodePoolTemplateMetadataArgs(KubeNodePoolTemplateMetadataArgs $) {
        this.annotations = $.annotations;
        this.finalizers = $.finalizers;
        this.labels = $.labels;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KubeNodePoolTemplateMetadataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KubeNodePoolTemplateMetadataArgs $;

        public Builder() {
            $ = new KubeNodePoolTemplateMetadataArgs();
        }

        public Builder(KubeNodePoolTemplateMetadataArgs defaults) {
            $ = new KubeNodePoolTemplateMetadataArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations Annotations to apply to each node
         * 
         * @return builder
         * 
         */
        public Builder annotations(Output<Map<String,String>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations Annotations to apply to each node
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,String> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param finalizers Finalizers to apply to each node. A finalizer name must be fully qualified, e.g. kubernetes.io/pv-protection , where you prefix it with hostname of your service which is related to the controller responsible for the finalizer.
         * 
         * @return builder
         * 
         */
        public Builder finalizers(Output<List<String>> finalizers) {
            $.finalizers = finalizers;
            return this;
        }

        /**
         * @param finalizers Finalizers to apply to each node. A finalizer name must be fully qualified, e.g. kubernetes.io/pv-protection , where you prefix it with hostname of your service which is related to the controller responsible for the finalizer.
         * 
         * @return builder
         * 
         */
        public Builder finalizers(List<String> finalizers) {
            return finalizers(Output.of(finalizers));
        }

        /**
         * @param finalizers Finalizers to apply to each node. A finalizer name must be fully qualified, e.g. kubernetes.io/pv-protection , where you prefix it with hostname of your service which is related to the controller responsible for the finalizer.
         * 
         * @return builder
         * 
         */
        public Builder finalizers(String... finalizers) {
            return finalizers(List.of(finalizers));
        }

        /**
         * @param labels Labels to apply to each node
         * 
         * @return builder
         * 
         */
        public Builder labels(Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels to apply to each node
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public KubeNodePoolTemplateMetadataArgs build() {
            $.annotations = Objects.requireNonNull($.annotations, "expected parameter 'annotations' to be non-null");
            $.finalizers = Objects.requireNonNull($.finalizers, "expected parameter 'finalizers' to be non-null");
            $.labels = Objects.requireNonNull($.labels, "expected parameter 'labels' to be non-null");
            return $;
        }
    }

}
