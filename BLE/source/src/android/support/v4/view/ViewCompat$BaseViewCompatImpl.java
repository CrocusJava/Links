// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.graphics.Paint;
import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityNodeProviderCompat;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.view:
//            ViewCompat, AccessibilityDelegateCompat

static class eInfoCompat
    implements eInfoCompat
{

    public boolean canScrollHorizontally(View view, int i)
    {
        return false;
    }

    public boolean canScrollVertically(View view, int i)
    {
        return false;
    }

    public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view)
    {
        return null;
    }

    long getFrameTime()
    {
        return 10L;
    }

    public int getImportantForAccessibility(View view)
    {
        return 0;
    }

    public int getLabelFor(View view)
    {
        return 0;
    }

    public int getLayerType(View view)
    {
        return 0;
    }

    public int getOverScrollMode(View view)
    {
        return 2;
    }

    public boolean hasTransientState(View view)
    {
        return false;
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
    }

    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
    }

    public boolean performAccessibilityAction(View view, int i, Bundle bundle)
    {
        return false;
    }

    public void postInvalidateOnAnimation(View view)
    {
        view.postInvalidateDelayed(getFrameTime());
    }

    public void postInvalidateOnAnimation(View view, int i, int j, int k, int l)
    {
        view.postInvalidateDelayed(getFrameTime(), i, j, k, l);
    }

    public void postOnAnimation(View view, Runnable runnable)
    {
        view.postDelayed(runnable, getFrameTime());
    }

    public void postOnAnimationDelayed(View view, Runnable runnable, long l)
    {
        view.postDelayed(runnable, l + getFrameTime());
    }

    public void setAccessibilityDelegate(View view, AccessibilityDelegateCompat accessibilitydelegatecompat)
    {
    }

    public void setHasTransientState(View view, boolean flag)
    {
    }

    public void setImportantForAccessibility(View view, int i)
    {
    }

    public void setLabelFor(View view, int i)
    {
    }

    public void setLayerType(View view, int i, Paint paint)
    {
    }

    public void setOverScrollMode(View view, int i)
    {
    }

    eInfoCompat()
    {
    }
}