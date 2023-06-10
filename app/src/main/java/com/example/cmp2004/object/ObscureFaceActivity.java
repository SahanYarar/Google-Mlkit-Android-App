package com.example.cmp2004.object;

import androidx.camera.core.CameraSelector;

import com.example.cmp2004.helpers.MLVideoHelperActivity;
import com.example.cmp2004.helpers.vision.VisionBaseProcessor;
import com.example.cmp2004.helpers.vision.obscure.ObscureFaceProcessor;
import com.example.cmp2004.helpers.vision.obscure.ObscureType;

public class ObscureFaceActivity extends MLVideoHelperActivity {

    private ObscureFaceProcessor obscureFaceProcessor;

    @Override
    protected VisionBaseProcessor setProcessor() {
        obscureFaceProcessor = new ObscureFaceProcessor(graphicOverlay);
        obscureFaceProcessor.setObscureType(ObscureType.TRANSLUCENT);
        return obscureFaceProcessor;
    }

    @Override
    protected int getLensFacing() {
        return CameraSelector.LENS_FACING_FRONT;
    }
}
