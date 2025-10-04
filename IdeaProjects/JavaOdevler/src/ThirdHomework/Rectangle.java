package ThirdHomework;

public class Rectangle {
    /*Write a program that calculates the area and perimeter of the given rectangle.

					Example:
						length = 4.5
						width = 2

					Output:
						The area of the rectangle is 9.0
						The perimeter of the rectangle is 13.0

			Hint:
				Area of rectangle:
					area=length×width

				Perimeter of rectangle:
					perimeter=2×(length+width)*/
    public static void main(String[] args) {
        int length = 4;
        int width = 3;
        int area = length*width;
        int perimeter = 2*(length+width);
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);

    }
}
