// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.CloudProject.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetUsersUserRole {
    /**
     * @return description of the role
     * 
     */
    private String description;
    /**
     * @return id of the role
     * 
     */
    private String id;
    /**
     * @return name of the role
     * 
     */
    private String name;
    /**
     * @return list of permissions associated with the role
     * 
     */
    private List<String> permissions;

    private GetUsersUserRole() {}
    /**
     * @return description of the role
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return id of the role
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return name of the role
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return list of permissions associated with the role
     * 
     */
    public List<String> permissions() {
        return this.permissions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUsersUserRole defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private String id;
        private String name;
        private List<String> permissions;
        public Builder() {}
        public Builder(GetUsersUserRole defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.permissions = defaults.permissions;
        }

        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetUsersUserRole", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetUsersUserRole", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetUsersUserRole", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder permissions(List<String> permissions) {
            if (permissions == null) {
              throw new MissingRequiredPropertyException("GetUsersUserRole", "permissions");
            }
            this.permissions = permissions;
            return this;
        }
        public Builder permissions(String... permissions) {
            return permissions(List.of(permissions));
        }
        public GetUsersUserRole build() {
            final var _resultValue = new GetUsersUserRole();
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.permissions = permissions;
            return _resultValue;
        }
    }
}