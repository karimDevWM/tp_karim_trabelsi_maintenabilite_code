package com.simplecity.amp_library.billing;

import android.app.Activity;
import android.support.annotation.Nullable;
import android.util.Log;
import java.util.List;
import javax.inject.Inject;

public class BillingManager {

    private static final String TAG = "BillingManager";

    public static final int BILLING_MANAGER_NOT_INITIALIZED = -1;

    public interface BillingUpdatesListener {
        void onPurchasesUpdated(List<com.simplecity.amp_library.billing.Purchase> purchases);
        void onPremiumPurchaseCompleted();
        void onPremiumPurchaseRestored();
    }

    public static class BillingResponse {
        public static final int OK = 0;
        public static final int USER_CANCELED = 1;
    }

    public static class SkuType {
        public static final String INAPP = "inapp";
    }

    private int billingClientResponseCode = BILLING_MANAGER_NOT_INITIALIZED;

    @Inject
    public BillingManager(Activity activity, BillingUpdatesListener updatesListener) {
        Log.d(TAG, "BillingManager stub initialized");
    }

    public void queryPurchases() { }

    public void initiatePurchaseFlow(final String skuId, final String billingType) {
        Log.d(TAG, "Purchase flow initiated (stub)");
    }

    public void restorePurchases() { }

    public int getBillingClientResponseCode() {
        return billingClientResponseCode;
    }

    public void destroy() { }
}