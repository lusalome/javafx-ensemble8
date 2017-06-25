/*
 * Copyright (c) 2008, 2014, Oracle and/or its affiliates.
 * All rights reserved. Use is subject to license terms.
 *
 * This file is available and licensed under the following license:
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  - Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *  - Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the distribution.
 *  - Neither the name of Oracle Corporation nor the names of its
 *    contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package ensemble.samples.graphics2d.shapes.rectangle;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * A sample showing how various settings effect two rectangles.
 *
 * @sampleName Rectangle
 * @preview preview.png
 * @see Rectangle
 * @see javafx.scene.shape.Shape
 * @see Color
 * @playground rect1.fill (name="Rectangle 1 Fill")
 * @playground rect1.width (name="Rectangle 1 Width", min=10, max=50)
 * @playground rect1.height (name="Rectangle 1 Height", min=10, max=50)
 * @playground rect1.arcWidth (name="Rectangle 1 Arc Width", min=0, max=50)
 * @playground rect1.arcHeight (name="Rectangle 1 Arc Height", min=0, max=50)
 * @playground rect2.stroke (name="Rectangle 2 Stroke")
 * @playground rect2.strokeWidth (name="Rectangle 2 Stroke Width", min=1, max=5)
 * @playground rect2.width (name="Rectangle 2 Width", min=10, max=50)
 * @playground rect2.height (name="Rectangle 2 Height", min=10, max=50)
 * @playground rect2.arcWidth (name="Rectangle 2 Arc Width", min=0, max=50)
 * @playground rect2.arcHeight (name="Rectangle 2 Arc Height", min=0, max=50)
 * @embedded
 */
public class RectangleApp extends Application {
    // Simple filled rectangle
    Rectangle rect1 = new Rectangle(25, 25, 40, 40);
    // Stroked rectangle
    Rectangle rect2 = new Rectangle(135, 25, 40, 40);

    public Parent createContent() {
        Pane root = new Pane();
        root.setPrefSize(200, 100);
        root.setMinSize(Region.USE_PREF_SIZE, Region.USE_PREF_SIZE);
        root.setMaxSize(Region.USE_PREF_SIZE, Region.USE_PREF_SIZE);
        // Make the simple rectangle red
        rect1.setFill(Color.RED);
        // Make the stroked rectangle blue
        rect2.setStroke(Color.DODGERBLUE);
        rect2.setFill(null);
        root.getChildren().addAll(rect1, rect2);
        return root;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(createContent()));
        primaryStage.show();
    }

    /**
     * Java main for when running without JavaFX launcher
     * @param args command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}