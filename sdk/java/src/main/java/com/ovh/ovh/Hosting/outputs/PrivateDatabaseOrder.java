// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.ovh.ovh.Hosting.outputs;

import com.ovh.ovh.Hosting.outputs.PrivateDatabaseOrderDetail;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PrivateDatabaseOrder {
    /**
     * @return date
     * 
     */
    private @Nullable String date;
    /**
     * @return Information about a Bill entry
     * 
     */
    private @Nullable List<PrivateDatabaseOrderDetail> details;
    /**
     * @return expiration date
     * 
     */
    private @Nullable String expirationDate;
    /**
     * @return order id
     * 
     */
    private @Nullable Integer orderId;

    private PrivateDatabaseOrder() {}
    /**
     * @return date
     * 
     */
    public Optional<String> date() {
        return Optional.ofNullable(this.date);
    }
    /**
     * @return Information about a Bill entry
     * 
     */
    public List<PrivateDatabaseOrderDetail> details() {
        return this.details == null ? List.of() : this.details;
    }
    /**
     * @return expiration date
     * 
     */
    public Optional<String> expirationDate() {
        return Optional.ofNullable(this.expirationDate);
    }
    /**
     * @return order id
     * 
     */
    public Optional<Integer> orderId() {
        return Optional.ofNullable(this.orderId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateDatabaseOrder defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String date;
        private @Nullable List<PrivateDatabaseOrderDetail> details;
        private @Nullable String expirationDate;
        private @Nullable Integer orderId;
        public Builder() {}
        public Builder(PrivateDatabaseOrder defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.date = defaults.date;
    	      this.details = defaults.details;
    	      this.expirationDate = defaults.expirationDate;
    	      this.orderId = defaults.orderId;
        }

        @CustomType.Setter
        public Builder date(@Nullable String date) {
            this.date = date;
            return this;
        }
        @CustomType.Setter
        public Builder details(@Nullable List<PrivateDatabaseOrderDetail> details) {
            this.details = details;
            return this;
        }
        public Builder details(PrivateDatabaseOrderDetail... details) {
            return details(List.of(details));
        }
        @CustomType.Setter
        public Builder expirationDate(@Nullable String expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }
        @CustomType.Setter
        public Builder orderId(@Nullable Integer orderId) {
            this.orderId = orderId;
            return this;
        }
        public PrivateDatabaseOrder build() {
            final var o = new PrivateDatabaseOrder();
            o.date = date;
            o.details = details;
            o.expirationDate = expirationDate;
            o.orderId = orderId;
            return o;
        }
    }
}
