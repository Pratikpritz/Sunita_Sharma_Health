package calci;

import java.util.*;
public class SunitaSharma  {
	public static void main(String[] args) {
		System.out.println("Hello Sunitaji,\nGreetings of the Day to you.\nWe Welcome you to Kratins Healthcare and Solutions\nHope you are taking Good care of yourself! ");
		System.out.println("\nHow could I assist you Today?");
		System.out.println("Here are the following Tips and Services Provided by us....\nPlease click:-");
		System.out.println("1.For your Everyday Health Chart.");
		System.out.println("2.To check Your Body Mass Index(BMI) and know your health condition and Tips Required.");
		System.out.println("3.To know your Daily Calorie Level Intake.");
		System.out.println("4.To know whether Health checkup required or not.");
		System.out.println("5.To know Schedule of your Daily Exercise/Yogasana Schedule.");
		System.out.println("6.(EMERGENCY)Feeling low or Uncomfortable.");
		Scanner n=new Scanner(System.in);
		int input=n.nextInt();
		
		switch(input) {
		case 1:
			System.out.println("Here's your Everyday Health Chart \n1.Wakeup -> 6:00 am Take fresh air and have 2 Glasses of Water");
			System.out.println("2.Yoga -> 6:30am -7:30am");
			System.out.println("3.Breakfast -> 8:30 am");
			System.out.println("4.Lunch -> Balanced Diet ->12:00am");
			System.out.println("5.walk ->20 min");
			System.out.println("6.Spent some time for your refreshment ");
			System.out.println("7.Evening walk");
			System.out.println("8.Dinner -> 7:30pm");
			System.out.println("9.Walk -> 30 min");
			System.out.println("10.Time for Bed->9:30 pm");
			System.out.println("\n  Always Remember an Apple a Day Keeps Doctor Away\n  Have a Good Day!\n  Thanks for using Kratins Healthcare and Solutions. ");
			
			break;
		case 2:
			System.out.print("Input weight in kilogram: ");
		    double weight = n.nextDouble();
		    System.out.print("\nInput height in meters: ");
		    double height = n.nextDouble();
		    double BMI = weight / (height * height);
		    System.out.print("\nThe Body Mass Index (BMI) is " + BMI + " kg/m2\nHealth Condition:-");
		    if(BMI < 18.5) {
	            System.out.println("You are underweight");
	            System.out.println("Here are some healthy ways to gain weight when you're underweight:\n"
	            		+ "Eat more frequently. When you're underweight, you may feel full faster\n"
	            		+ "Choose nutrient-rich foods\n"
	            		+ "Try smoothies and shakes\n"
	            		+ "Watch when you drink\n"
	            		+ "Make every bite\n"
	            		+ "Top it off\n"
	            		+ "Have an occasional treat\n"
	            		+ "Exercise.");
	        }else if (BMI < 25) {
	            System.out.println("You are normal");
	        }else if (BMI < 30) {
	            System.out.println("You are overweight");
	            System.out.println("You have to Reduce your Daily CALORIE INTAKE\nCut down your SALT\nHave Some CARDIO AND WORKOUT");
	        }else {
	            System.out.println("You are obese");
	            System.out.println("You have to : \n" + "Exercise more\n"+ "Move throughout the Day\n" +
	            "Look for support Groups\n"+"Eat less at Night\n"+"Choose right Supplements\n"+"Limit Added Sugar");
	        }
		    System.out.println("\n  Always Remember an Apple a Day Keeps Doctor Away\n  Have a Good Day!\n  Thanks for using Kratins Healthcare and Solutions. ");
			
		    break;
		case 3:
			int age;
	        int height1;
	        int weight1;
	        String gender;
	        int BMR;
	        char genderChar;
	        boolean male;
	        boolean none = false;
	        boolean light = false;
	        boolean moderately = false;
	        boolean intensely = false;
	        double cal;

	        Scanner keyboard = new Scanner(System.in);

	        System.out.println("What is your gender? M or F: ");
	        gender = keyboard.nextLine(); 

	        System.out.println("What is your age: ");
	        age = keyboard.nextInt();

	        System.out.println("What is your weight(kg): ");
	        weight1 = keyboard.nextInt();

	        System.out.println("What is your height(cm): ");
	        height1 = keyboard.nextInt();

	        genderChar = gender.charAt(0);

	        male = genderChar == 'M';

	        if (male)
	        {
	            BMR = (int) (66 + (6.23 * weight1) + (12.7 * height1) - (6.8 * age));
	        }
	        else
	        {
	            BMR = (int) (665 + (4.35 * weight1) + (4.7 * height1) - (4.7 * age));
	        }

	        

	        if (male)
	        {
	            System.out.println("Your BMR is " + BMR);
	        }
	        else
	            System.out.println("Your BMR is " + BMR);

	        

	        if (none)
	        {
	            cal =  (BMR * 1.2);
	        }
	        else if (light)
	        {
	            cal = (BMR * 1.375);
	        }
	        else if (moderately)
	        {
	            cal = (BMR * 1.55);
	        }
	        else if (intensely)
	        {   
	            cal = (BMR * 1.725);
	        }
	        else
	        {
	            cal = (BMR * 1.9);
	        }

	        

	        System.out.println("Your daily calorie needs " + cal);
	        System.out.println("\n  Always Remember an Apple a Day Keeps Doctor Away\n  Have a Good Day!\n  Thanks for using Kratins Healthcare and Solutions. ");
			
	        break;
		case 4:
			System.out.println("In which month the Last checkup was done(1 to 12)");
            int months = n.nextInt();
            System.out.println("Please Provide your Cholestrol level in mg/dl");
            int chol = n.nextInt();
            System.out.println("Enter your Diastolic and Systolic Blood Pressure (dbp and sbp)in mm Hg");
            int dbp = n.nextInt();
            int sbp = n.nextInt();
            System.out.println("Enter your Sugar Levels Before meal and After meal in mg/dl");
            int bm = n.nextInt();
            int am = n.nextInt();


            if ((months >= 3) && (chol >= 200 || dbp < 80 || sbp > 150 || bm < 70 || bm > 130 || am > 180)) {
                System.out.println("\nMonths :" + months + "\nCholestrol  level in mg/dl : " + chol + "\nDiastolic and Systolic Blood Pressure in mm Hg \nDiastolic :" + dbp + "\nSystolic :" + sbp + "\nSugar Levels Before meal and After meal in mg/dl : \nBefore meal:" + bm + "\nAfter meal:" + am + "\nYou need to visit the doctor since the readings in the above Performed tests are not within the normal range and your last visit exceeded the time span of 3 Months");
            }
            else if (chol >= 200 || dbp < 80 || sbp > 150 || bm < 70 || bm > 130 || am > 180) {
                System.out.println("\nCholestrol  level in mg/dl : " + chol + "\nDiastolic and Systolic Blood Pressure in mm Hg \nDiastolic :" + dbp + "\nSystolic :" + dbp + "\nSugar Levels Before meal and After meal in mg/dl : \nBefore meal:" + bm+ "\nAfter meal:" + am+ "\nYou need to visit the doctor since the readings in the above Performed tests are not within the normal range");
            }
            else if (months >= 3) {
                System.out.println("\nYou need to visit the doctor since your last visit exceeded the time span of 3 Months \nMonths :" + months);
            }
            System.out.println("\n  Always Remember an Apple a Day Keeps Doctor Away\n  Have a Good Day!\n  Thanks for using Kratins Healthcare and Solutions. ");
			
            break;
		case 5:
			System.out.println("Please select Today's Day option from below list:-");
			System.out.println("Monday-Press a\nTuesday-Press b\nWednesday-Press c\nThursday-Press d\nFriday-Press e\nSaturday-Press f\nSunday-Press g");
			char day=n.next().charAt(0);
			SunitaSharma Day=new SunitaSharma();
			if(day=='a')
			{
				Day.Monday();
			}
			else if(day=='b')
			{
				Day.Tuesday();
			}
			else if(day=='c')
			{
				Day.Wednesday();
			}
			else if(day=='d')
			{
				Day.Thursday();
			}
			else if(day=='e')
			{
				Day.Friday();
			}
			else if(day=='f')
			{
				Day.Saturday();
			}
			else if(day=='g')
			{
				Day.Sunday();
			}
			else
			{
				System.out.println("Please press Valid Key");
			}
			System.out.println("\n  Always Remember An Apple a Day Keeps the Doctor Away\n  Have a Good Day!\n  Thanks for using Kratins Healthcare and Solutions. ");
			
			break;
		case 6:
			System.out.println("Urgently please call on the Given Contact number:-**********\nPlease be Relax>>>Our Doctor will visit your home within 10-20 minutes ");
			System.out.println("\n  Always Remember an Apple a Day Keeps Doctor Away\n  Have a Good Day!\n  Thanks for using Kratins Healthcare and Solutions. ");
			break;
		default:
			System.out.println("Please Provide valid Option from above");
			
		}
	}
	void Monday()
	{
		System.out.println("Monday-You have to do Yoga for Today\n");
		System.out.println("i.Mountain Pose\r\n"
				+ "\r\n"
				+ "This yoga pose helps with balance and grounding through the feet. \nStand tall with your big toes touching and heels together. Draw your abdominals in and up and relax your shoulders down and back. Breathe five to eight breaths.");
		System.out.println("\nii.Tree Pose\r\n"
				+ "\r\n"
				+ "Excellent for leg and abdominal strength. Good for seniors for balance and concentration. \nStand tall and place one foot on the opposite inner thigh, either above or below the knee. Open the leg to the side, bring your hands to a prayer position and hold for five to eight breaths.");
	}
	void Tuesday()
	{
		System.out.println("Tuesday-You have to Exercise Today\n");
		System.out.println("(a)Abdominal contractions\n"+"**To increase strength in the abdominal muscles**" +
                "\n1)Take a deep breath and tighten your abdominal muscles.\n" +
                "2)Hold for 3 breaths and then release the contraction.\n" +
                "3)Repeat 10 times");
        System.out.println("(b)Heel raises\n"+
                "**To strengthen the upper calves**\n" +
                "1)Sitting in a chair, keep your toes and the balls of your feet on the floor and lift your heels.\n" +
                "2)Repeat 20 times.");
        System.out.println("(c)Ankle rotations\n"+
                "**To strengthen the calves**\n" +
                "1)Seated in a chair, lift your right foot off the floor and slowly rotate your foot 5 times to the right and then 5 times to the left.\n" +
                "2)Repeat with the left foot");
	}
	void Wednesday()
	{
		System.out.println("Wednesday-You have to do Yoga Today\n");
		System.out.println("i.Bird Dog\r\n"
				+ "\r\n"
				+ "Good for abdominals and back support. The health of the spine is extremely important as we age. \nStart by kneeling and stretching one arm forward and the opposite leg back. Imagine you have a tea cup on your back and draw your belly button towards your spine. Stay for a breath and then switch sides. Repeat five times.");
		System.out.println("\nii.Downward Facing Dog\r\n"
				+ "\r\n"
				+ "This position is great for joint health, flexibility and all-over body strength. \nStart on your hands and knees, tuck your toes under and lift your hips up and back until your body forms a triangle. Use your core strength and legs to bring the weight back as much as possible. Stay for five to eight breaths, lower yourself down, and repeat two more times. For seniors with wrist issues, try the Forearm Downward Dog instead, putting your forearms flat on the mat.");
		System.out.println("\niii.Sphinx\r\n"
				+ "\r\n"
				+ "Excellent for upper back strength and preventing forward head syndrome. Sphinx is gentle and really does a great job of opening up the chest and working the rear deltoids. \nLie down on your stomach and place your forearms on the mat, elbows under your shoulders. Press firmly into your arms and draw your shoulder blades together and down your back. Lift your abdominals in and up and stay for five to eight breaths.");
	}
	void Thursday()
	{
		System.out.println("Thursday-You have to Exercise Today\n");
		System.out.println("(a)Shifting weight\n"+
                "1)Stand with your feet hip-width apart and your weight evenly distributed on both feet.\n" +
                "2)Relax your hands at your sides. You can also do this exercise with a sturdy chair in front of you in case you need to grab it for balance.\n" +
                "3)Shift your weight on to your right side, then lift your left foot a few inches off of the floor.\n" +
                "4)Hold for 10 seconds, eventually working up to 30 seconds.\n" +
                "5)Return to the starting position and repeat with the opposite leg.\n" +
                "6)Repeat 3 times.\n");
        System.out.println("(b)Single leg balance\n"+
                "1)Stand with your feet hip-width apart, with your hands on your hips or on the back of a sturdy chair if you need support.\n" +
                "2)Lift your left foot off of the floor, bending at the knee and lifting your heel halfway between the floor and your buttocks.\n" +
                "3)Hold for 10 seconds, eventually working up to 30 seconds.\n" +
                "4)Return to the starting position and repeat with the opposite leg.\n" +
                "5)Repeat 3 times");
	}
	void Friday()
	{
		System.out.println("Friday-You have to do Yoga Today\n");
		System.out.println("i.Cobbler’s Pose\r\n"
				+ "\r\n"
				+ "This is a great way for seniors to keep their hips open and massage their feet. \nSit tall and bring the soles of the feet together as you open your knees out to the sides. Fold yourself forward for a deeper stretch but try to prevent rounding too much in the lower back. Hold for five to eight breaths.");
		System.out.println("\nii.Savasana\r\n"
				+ "\r\n"
				+ "Savasana resets the nervous system and helps with restoring peace to the body and mind. \nLie on your back in final relaxation. It’s good for seniors to get comfortable with letting go more often throughout the day. Lie down and let the floor support you. Completely relax the muscles and breathe as you lie there and take a deep, restorative break.");
	}
	void Saturday()
	{
		System.out.println("Saturday-You have to have some Stretching Today\n");
		System.out.println("i)Standing Quadriceps Stretch.\n"
				+"ii.)Seated Knee to Chest.\n"
				+ "iii.)Hamstring Stretch.\n"
				+ "iv)Soleus Stretch.\n"
				+ "v)Overhead Side Stretch.\n"
				+ "vi)Shoulder Stretch.\n"
				+ "vii)Tricep Stretch.\n"
				+ "viii)Lunge in a Chair");
	}
	void Sunday()
	{
		System.out.println("It's a Rest day for you Today");
	}
	
}
