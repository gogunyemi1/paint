package pk.edu.seecs.cs361.paint.shapes;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import pk.edu.seecs.cs361.paint.core.PaintBrush;

/**
 * Created by saifkhichi96 on 23/10/2017.
 */
public class ShapeFactory {

    public static Shape get(Class<? extends Shape> type, PaintBrush paintBrush) {
        Shape shape = null;
        try {
            Constructor<? extends Shape> ctor = type.getConstructor(PaintBrush.class);
            shape = ctor.newInstance(paintBrush);
        } catch (NoSuchMethodException | IllegalAccessException |
                InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return shape;
    }

}
