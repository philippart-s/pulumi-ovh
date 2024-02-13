// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.Iam.outputs;

import com.ovh.ovh.Iam.outputs.GetReferenceActionsAction;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetReferenceActionsResult {
    /**
     * @return List of actions
     * 
     */
    private List<GetReferenceActionsAction> actions;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String type;

    private GetReferenceActionsResult() {}
    /**
     * @return List of actions
     * 
     */
    public List<GetReferenceActionsAction> actions() {
        return this.actions;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReferenceActionsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetReferenceActionsAction> actions;
        private String id;
        private String type;
        public Builder() {}
        public Builder(GetReferenceActionsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.id = defaults.id;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder actions(List<GetReferenceActionsAction> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }
        public Builder actions(GetReferenceActionsAction... actions) {
            return actions(List.of(actions));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetReferenceActionsResult build() {
            final var o = new GetReferenceActionsResult();
            o.actions = actions;
            o.id = id;
            o.type = type;
            return o;
        }
    }
}
