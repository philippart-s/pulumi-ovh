// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.CloudProject.outputs;

import com.ovh.ovh.CloudProject.outputs.KubeCustomizationApiserver;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class KubeCustomization {
    /**
     * @return Kubernetes API server customization
     * 
     * @deprecated
     * Use customization_apiserver instead
     * 
     */
    @Deprecated /* Use customization_apiserver instead */
    private @Nullable List<KubeCustomizationApiserver> apiservers;

    private KubeCustomization() {}
    /**
     * @return Kubernetes API server customization
     * 
     * @deprecated
     * Use customization_apiserver instead
     * 
     */
    @Deprecated /* Use customization_apiserver instead */
    public List<KubeCustomizationApiserver> apiservers() {
        return this.apiservers == null ? List.of() : this.apiservers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubeCustomization defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<KubeCustomizationApiserver> apiservers;
        public Builder() {}
        public Builder(KubeCustomization defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiservers = defaults.apiservers;
        }

        @CustomType.Setter
        public Builder apiservers(@Nullable List<KubeCustomizationApiserver> apiservers) {
            this.apiservers = apiservers;
            return this;
        }
        public Builder apiservers(KubeCustomizationApiserver... apiservers) {
            return apiservers(List.of(apiservers));
        }
        public KubeCustomization build() {
            final var o = new KubeCustomization();
            o.apiservers = apiservers;
            return o;
        }
    }
}
