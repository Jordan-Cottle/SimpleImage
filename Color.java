
/**
 * Utility class to manage combined color ints as Color objects with seperate red, green, and blue values.
 */
public class Color {
    private final int red;
    private final int green;
    private final int blue;
    private final int colorInt;

    // Static colors, ready to use
    public static final Color RED = new Color(255,0,0);
    public static final Color GREEN = new Color(0,255,0);
    public static final Color BLUE = new Color(0,0,255);
    public static final Color BLACK = new Color(0,0,0);
    public static final Color WHITE = new Color(255,255,255);

    /**
     * Contruct a new Color object from a red, green, and blue value in the range of [0,255]
     * @param red The red component of this color
     * @param green The green comopnent of this color
     * @param blue The blue component of this color
     */
    public Color(int red, int green, int blue){
        this.red = red;
        this.green = green;
        this.blue = blue;

        this.colorInt = rgbToInt(red, green, blue);
    }

    /**
     * Pakcs seperate red, green, and blue values into single integer format.
     * @param red The value of the red component
     * @param green The value of the green component
     * @param blue The value of the blue component
     * @return An integer representing the combined red, green, and blue values
     */
    public static int rgbToInt(int red, int green, int blue){
        return (255) << 24 | (red) << 16 | (green) << 8 | (blue);
    }

    /**
     * @return The packed integer that represents the red, green, and blue components of this Color
     */
    public int getColorInt(){
        return colorInt;
    }

    /**
     * Returns the red, green, and blue values of this Color as an integer array
     * @return The RGB values of this Color in an integer array with red at index 0, green at 1, blue at 2
     */
    public int [] getRGB(){
        return new int[] {red, green, blue};
    }

    /**
     * @return The red component of this Color
     */
    public int getRed(){
        return this.red;
    }

    /**
     * @return The green component of this Color
     */
    public int getGreen(){
        return this.green;
    }

    /**
     * @return The blue component of this Color
     */
    public int getBlue(){
        return this.blue;
    }
}
