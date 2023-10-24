package snacks;

import java.util.Scanner;

public class MBTITest {
    private static final Scanner output = new Scanner(System.in);
    private static final String[] eiAnswers = new String[6];
    private static int eiACounter;
    private static int eiBCounter;
    private static final String[] snAnswers = new String[5];
    private static int snACounter;
    private static int snBCounter;
    private static final String[] tfAnswers = new String[5];
    private static int tfACounter;
    private static int tfBCounter;

    private static final String[] jpAnswers = new String[5];
    private static int jpACounter;
    private static int jpBCounter;

    private static final String finalResult = " ";


    public static void main(String[] args) {
        MBTITest.Test();
        MBTITest.Test1();
        MBTITest.Test2();
        MBTITest.Test3();
        MBTITest.Test4();
        MBTITest.Test5();
        MBTITest.Test6();
        MBTITest.Test7();
        MBTITest.Test8();
        MBTITest.Test9();
        MBTITest.Test10();
        MBTITest.Test11();
        MBTITest.Test12();
        MBTITest.Test13();
        MBTITest.Test14();
        MBTITest.Test15();
        MBTITest.Test16();
        MBTITest.Test17();
        MBTITest.Test18();
        MBTITest.Test19();
        display();
        trait();
    }

    public static void Test() {
        System.out.println("What is your name: ");
        String name = output.nextLine();
        if (name.matches("^[a-zA-Z]+$")) {
            System.out.println(name);
        } else {
            System.out.println("Invalid input");
            Test();
        }
        System.out.println("A. Expend energy, enjoy groups.       B. Conserve energy, one-on-one");
        eiAnswers[0] = "Dear" + " " + name + " " + "You selected";
        String answer = output.nextLine();

        if (answer.equalsIgnoreCase("A")) {
            eiAnswers[0] = "A. Expend energy, enjoy groups.";
            eiACounter++;
        } else if (answer.equalsIgnoreCase("B")) {
            eiAnswers[0] = "B. Conserve energy, one-on-one";
            eiBCounter++;
        } else {
            System.out.println("Expected A or B as response\n I know this is an error,please retry again");
            Test();
        }
    }

    public static void Test1() {
        System.out.println("A. Interpret literally.         B. Look for meaning and possibilities.");
        String answer = output.nextLine();
        if (answer.equalsIgnoreCase("A")) {
            snAnswers[0] = "A. Interpret literally.  ";
            snACounter++;
        } else if (answer.equalsIgnoreCase("B")) {
            snAnswers[0] = "B. Look for meaning and possibilities.";
            snBCounter++;
        } else {
            System.out.println("Invalid input");
            Test1();
        }
    }

    public static void Test2() {
        System.out.println("A. Logical, thinking, questioning.          B. Empathetic, feeling, accommodating");
        String answer = output.nextLine();
        if (answer.equalsIgnoreCase("A")) {
            tfAnswers[0] = "A. Logical, thinking, questioning.";
            tfACounter++;
        } else if (answer.equalsIgnoreCase("B")) {
            tfAnswers[0] = "B. Empathetic, feeling, accommodating.";
            tfBCounter++;
        } else {
            System.out.println("Invalid input");
            Test2();
        }
    }

    public static void Test3() {
        System.out.println("A. Organized, orderly.          B. Flexible, adaptable");
        String answer = output.nextLine();
        if (answer.equalsIgnoreCase("A")) {
            jpAnswers[4] = "A. Organized, orderly.";
            jpACounter++;
        } else if (answer.equalsIgnoreCase("B")) {
            jpAnswers[4] = "B. Flexible, adaptable";
            jpBCounter++;
        } else {
            System.out.println("Invalid input");
            Test3();
        }
    }

    public static void Test4() {
        System.out.println("A. More outgoing, think out loud.           B. More reserved, think to yourself.");
        String answer = output.nextLine();
        if (answer.equalsIgnoreCase("A")) {
            eiAnswers[1] = "A. More outgoing, think out loud.";
            eiACounter++;
        } else if (answer.equalsIgnoreCase("B")) {
            eiAnswers[1] = "B. More reserved, think to yourself.";
            eiBCounter++;
        } else {
            System.out.println("Invalid input");
            Test4();
        }
    }


    public static void Test5() {
        System.out.println(" 6) A. Practical, realistic, experiential.          B. Imagination, innovative, theoretical.");
        String answer = output.nextLine();
        if (answer.equalsIgnoreCase("A")) {
            snAnswers[1] = "A. Practical, realistic, experiential.";
            snACounter++;
        } else if (answer.equalsIgnoreCase("B")) {
            snAnswers[1] = "B. Imagination, innovative, theoretical.";
            snBCounter++;
        } else {
            System.out.println("Invalid input");
            Test5();
        }
    }

    public static void Test6() {
        System.out.println(" 7) A. Candid, straight forward, frank.         B. Tactful, kind, encouraging.");
        String answer = output.nextLine();
        if (answer.equalsIgnoreCase("A")) {
            tfAnswers[1] = "A. Candid, straight forward, frank,";
            tfACounter++;
        } else if (answer.equalsIgnoreCase("B")) {
            tfAnswers[1] = "B. Tactful, kind, encouraging.";
            tfBCounter++;
        } else {
            System.out.println("Invalid input");
            Test6();
        }
    }

    public static void Test7() {
        System.out.println(" 8) A. Plan, schedule.          B. Unplanned, spontaneous");
        String answer = output.nextLine();
        if (answer.equalsIgnoreCase("A")) {
            jpAnswers[1] = "A. Plan, schedule.";
            jpACounter++;
        } else if (answer.equalsIgnoreCase("B")) {
            jpAnswers[1] = "B. Unplanned, spontaneous";
            jpBCounter++;
        } else {
            System.out.println("Invalid input");
            Test7();
        }
    }

    public static void Test8() {
        System.out.println(" 9) A. seek many tasks, public activities, interaction with others          B. seek private, solitary activities with quiet to concentrate.");
        String answer = output.nextLine();
        if (answer.equalsIgnoreCase("A")) {
            eiAnswers[3] = "A. seek many tasks, public activities, interaction with others.";
            eiACounter++;
        } else if (answer.equalsIgnoreCase("B")) {
            eiAnswers[3] = "B. seek private, solitary activities with quiet to concentrate.";
            eiBCounter++;
        } else {
            System.out.println("Invalid input");
            Test8();
        }
    }

    public static void Test9() {
        System.out.println("10) A. standard, usual, conventional.          B. different, novel, unique. ");
        String answer = output.nextLine();
        if (answer.equalsIgnoreCase("A")) {
            snAnswers[2] = "A. standard, usual, conventional.";
            snACounter++;
        } else if (answer.equalsIgnoreCase("B")) {
            snAnswers[2] = "B. different, novel, unique.";
            snBCounter++;
        } else {
            System.out.println("Invalid input");
            Test9();
        }
    }

    public static void Test10() {
        System.out.println("11) A. firm, tend to criticize, hold the line.         B. gentle, tend to appreciate, conciliate. ");
        String answer = output.nextLine();
        if (answer.equalsIgnoreCase("A")) {
            tfAnswers[2] = "A. firm, tend to criticize, hold the line.";
            tfACounter++;
        } else if (answer.equalsIgnoreCase("B")) {
            tfAnswers[2] = "B. gentle, tend to appreciate, conciliate.";
            tfBCounter++;
        } else {
            System.out.println("Invalid input");
            Test10();
        }
    }

    public static void Test11() {
        System.out.println("12) A.regulated, structured.           B. easygoing, live e and let live ");
        String answer = output.nextLine();
        if (answer.equalsIgnoreCase("A")) {
            jpAnswers[2] = "A.regulated, structured.";
            jpACounter++;
        } else if (answer.equalsIgnoreCase("B")) {
            jpAnswers[2] = "B.easygoing, live e and let live";
            jpBCounter++;
        } else {
            System.out.println("Invalid input");
            Test11();
        }
    }

    public static void Test12() {
        System.out.println("13) A. external, communicative, express yourself.          B. internal, reticent, keep to yourself. ");
        String answer = output.nextLine();
        if (answer.equalsIgnoreCase("A")) {
            eiAnswers[3] = "A. external, communicative, express yourself.";
            eiACounter++;
        } else if (answer.equalsIgnoreCase("B")) {
            eiAnswers[3] = "B. internal, reticent, keep to yourself.";
            eiBCounter++;
        } else {
            System.out.println("Invalid input");
            Test12();
        }
    }

    public static void Test13() {
        System.out.println("14) A. focus on here-and-now.          B. look to the future, global perspective, big picture");
        String answer = output.nextLine();
        if (answer.equalsIgnoreCase("A")) {
            snAnswers[3] = "A. focus on here-and-now.";
            snACounter++;
        } else if (answer.equalsIgnoreCase("B")) {
            snAnswers[3] = "B. look to the future, global perspective, big picture";
            snBCounter++;
        } else {
            System.out.println("Invalid input");
            Test13();
        }
    }

    public static void Test14() {
        System.out.println("15) A. tough minded, just.         B. tender-hearted, merciful ");
        String answer = output.nextLine();
        if (answer.equalsIgnoreCase("A")) {
            tfAnswers[3] = "A.tough minded, just.";
            tfACounter++;
        } else if (answer.equalsIgnoreCase("B")) {
            tfAnswers[0] = "B. tender-hearted, merciful ";
            tfBCounter++;
        } else {
            System.out.println("Invalid input");
            Test14();
        }
    }

    public static void Test15() {
        System.out.println("16) A. preparation, plan ahead.            B. go with the flow, adapt as you go. ");
        String answer = output.nextLine();
        if (answer.equalsIgnoreCase("A")) {
            jpAnswers[3] = "A. preparation, plan ahead.";
            jpACounter++;
        } else if (answer.equalsIgnoreCase("B")) {
            jpAnswers[3] = "B.go with the flow, adapt as you go.";
            jpBCounter++;
        } else {
            System.out.println("Invalid input");
            Test15();
        }
    }

    public static void Test16() {
        System.out.println("17) A. active, initiate.       B. reflective, deliberate ");
        String answer = output.nextLine();
        if (answer.equalsIgnoreCase("A")) {
            eiAnswers[5] = "A. active, initiate.";
            eiACounter++;
        } else if (answer.equalsIgnoreCase("B")) {
            eiAnswers[5] = "B. reflective, deliberate ";
            eiBCounter++;
        } else {
            System.out.println("Invalid input");
            Test16();
        }
    }

    public static void Test17() {
        System.out.println("18) A. facts, things, what is        B. ideas, dreams, 'what could be', philosophical ");
        String answer = output.nextLine();
        if (answer.equalsIgnoreCase("A")) {
            snAnswers[4] = "A. facts, things, what is";
            snACounter++;
        } else if (answer.equalsIgnoreCase("B")) {
            snAnswers[4] = "B. ideas, dreams, 'what could be', philosophical ";
            snACounter++;
        } else {
            System.out.println("Invalid input");
            Test17();
        }
    }

    public static void Test18() {
        System.out.println(" 19) A. matter of fact, issue oriented          B. sensitive, people-oriented, compassionate");
        String answer = output.nextLine();
        if (answer.equalsIgnoreCase("A")) {
            tfAnswers[4] = "A. matter of fact, issue oriented";
            tfACounter++;
        } else if (answer.equalsIgnoreCase("B")) {
            tfAnswers[4] = "B. sensitive, people-oriented, compassionate";
            tfBCounter++;
        } else {
            System.out.println("Invalid input");
            Test18();
        }
    }

    public static void Test19() {
        System.out.println(" 20) A. control, govern         B. latitude, freedom");
        String answer = output.nextLine();
        if (answer.equalsIgnoreCase("A")) {
            jpAnswers[4] = "A. control, govern";
            jpACounter++;
        } else if (answer.equalsIgnoreCase("B")) {
            jpAnswers[4] = "B. latitude, freedom";
            jpBCounter++;
        } else {
            System.out.println("Invalid input");
            Test19();
        }
    }

    public static void display() {
        System.out.println(eiAnswers[0]);

        System.out.println(eiAnswers[1] + "\n" + eiAnswers[2] + "\n" + eiAnswers[3] + "\n" + eiAnswers[4] + "\n" + eiAnswers[5]);
        System.out.println("Number of A selected : " + eiACounter + "\n" + "Number of B selected : " + eiBCounter + "\n");

        System.out.println(snAnswers[0] + "\n" + snAnswers[1] + "\n" + snAnswers[2] + "\n" + snAnswers[3] + "\n" + snAnswers[4]);
        System.out.println("Number of A selected : " + snACounter + "\n" + "Number of B selected : " + snBCounter + "\n");

        System.out.println(tfAnswers[0] + "\n" + tfAnswers[1] + "\n" + tfAnswers[2] + "\n" + tfAnswers[3] + "\n " + tfAnswers[4]);
        System.out.println("Number of A selected :" + tfACounter + "\n" + "Number of B selected : " + tfBCounter + "\n");

        System.out.println(jpAnswers[0] + "\n" + jpAnswers[1] + "\n" + jpAnswers[2] + "\n" + jpAnswers[3] + "\n " + jpAnswers[4]);
        System.out.println(("Number of B selected :" + jpACounter + "\n" + "NUmber of B selected :" + jpBCounter));
    }

    public static void trait() {
        String answer = "";
        if (eiACounter > eiBCounter) {
            answer = answer + "E";
        } else {
            answer += "I";
        }
        if (snACounter > snBCounter) {
            answer = answer + "S";
        } else {
            answer += "N";
        }
        if (tfACounter > tfBCounter) {
            answer = answer + "T";
        } else {
            answer = answer + "F";
        }
        if (jpACounter > jpBCounter) {
            answer = answer + "J";
        } else {
            answer = answer + "P";
        }
        System.out.println("Your personality is " + answer);

        switch (answer) {
            case "INFP" -> System.out.println("""
                    INFP stands for Introversion, iIntuition, Feeling, and Perceiving, which are four core personality traits. INFPs are energized by time alone (Introverted), focus on ideas and concepts rather than facts and details (intuitive), make decisions based on feelings and values (Feeling), and prefer to be spontaneous and flexible rather than planned.
                    The INFP personality type is also called the "Healer" because of their sympathetic idealism and gentle compassion for other people. Other nicknames for the INFP include:
                    INFPs are imaginative idealists, guided by their own core values and beliefs. To a Healer, possibilities are paramount; the realism of the moment is only of passing concern. They see potential for a better future, and pursue truth and meaning with their own individual flair.
                    INFPs are sensitive, caring, and compassionate, and are deeply concerned with the personal growth of themselves and others. Individualistic and nonjudgmental, INFPs believe that each person must find their own path. They enjoy spending time exploring their own ideas and values, and are gently encouraging to others to do the same. INFPs are creative and often artistic; they enjoy finding new outlets for self-expression.""");
            case "INFJ" -> System.out.println("""
                    INFJs are energized by time alone
                         intuitive: INFJs focus on ideas and concepts rather than facts and details
                         Feeling: INFJs make decisions based on feelings and values
                         Judging: INFJs prefer to be planned and organized rather than spontaneous and flexible

                     The INFJ personality type is also called the "Counselor" because of their tendency to be idealistic, compassionate, and sensitive.
                     .INFJs are thoughtful nurturers with a strong sense of personal integrity and a drive to help others realize their potential. Creative and dedicated, they have a talent for helping others with original solutions to their personal challenges.
                      They trust their insights about others and have strong faith in their ability to read people. Although they are sensitive, they are also reserved; the INFJ is a private sort, and is selective about sharing intimate thoughts and feelings.""");
            case "ENFP" -> System.out.println("""
                    ENFP stands for Extroversion, intuition, Feeling, and Perceiving, which are four core personality traits. ENFPs are energized by time spent with others (Extraverted), focus on ideas and concepts rather than facts and details (iIntuitive), make decisions based on feelings and values (Feeling), and prefer to be spontaneous and flexible rather than planned and organized (Perceiving).
                                        "The ENFP personality type is also called the Champion because of this type's enthusiasm for helping others realize their dreams. Other nicknames for the EN FP include:The Imaginative Motivator (MB-TI)" +
                                        "The Campaigner (16Personalities""");
            case "INTJ" -> System.out.println("""
                    INTJ stands for Introverted, iIntuitive, Thinking, Judging, which are four core personality traits.
                    INTJs are energized by time alone (Introverted), focus on ideas and concepts rather than facts and details (iIntuitive), make decisions based on logic and reason (Thinking) and prefer to be planned and organized rather than spontaneous.
                    INTJs are sometimes referred to as Mastermind personalities because of their strategic, logical way of thinking. Other nicknames for the INTJ include:
                    INTJs are analytical problem-solvers, eager to improve systems and processes with their innovative ideas. They have a talent for seeing possibilities for improvement, whether at work, at home, or in themselves.
                    Often intellectual, INTJs enjoy logical reasoning and complex problem-solving. They approach life by analyzing the theory behind what they see, and are typically focused inward, on their own thoughtful study of the world around them. INTJs are drawn to logical systems and are much less comfortable with the unpredictable nature of other people and their emotions. They are typically independent and selective about their relationships, preferring to associate with people who they find intellectually stimulating.""");
            case "ENTJ" -> System.out.println("""
                    ENTJ stands for Extraverted, iIntuitive, Thinking, Judging. ENTJ indicates a person who is energized by time spent with others (Extraverted), who focuses on ideas and concepts rather than facts and details (iIntuitive), who makes decisions based on logic and reason (Thinking) and who prefers to be planned and organized rather than spontaneous and flexible (Judging). ENTJs are sometimes referred to as Commander personalities because of their innate drive to lead others.ENTJs are strategic leaders, motivated to organize change. They are quick to see inefficiency and conceptualize new solutions, and enjoy developing long-range plans to accomplish their vision. They excel at logical reasoning and are usually articulate and quick-witted.
                    ENTJs are analytical and objective, and like bringing order to the world around them. When there are flaws in a system, the ENTJ sees them, and enjoys the process of discovering and implementing a better way. ENTJs are assertive and enjoy taking charge; they see their role as that of leader and manager, organizing people and processes to achieve their goals.\s""");
            case "ENTP" -> System.out.println("""
                    ENTP stands for Extraverted, iIntuitive, Thinking, Perceiving. ENTP indicates a person who is energized by time spent with others (Extraverted), who focuses on ideas and concepts rather than facts and details (iNtuitive), who makes decisions based on logic and reason (Thinking) and who prefers to be spontaneous and flexible rather than planned and organized (Perceiving). ENTPs are sometimes referred to as Visionary personalities because of their passion for new, innovative ideas.ENTPs are inspired innovators, motivated to find new solutions to intellectually challenging problems. They are curious and clever, and seek to comprehend the people, systems, and principles that surround them. Open-minded and unconventional, Visionaries want to analyze, understand, and influence other people.
                    ENTPs enjoy playing with ideas and especially like to banter with others. They use their quick wit and command of language to keep the upper hand with other people, often cheerfully poking fun at their habits and eccentricities. While the ENTP enjoys challenging others, in the end they are usually happy to live and let live. They are rarely judgmental, but they may have little patience for people who can't keep up.""");
            case "INTP" -> System.out.println("""
                    INTP stands for Introverted, Intuitive, Thinking, Perceiving.The INTP type describes a person who is energized by time alone (Introverted), who focuses on ideas and concepts rather than facts and details (iIntuitive), who makes decisions based on logic and reason (Thinking) and who prefers to be spontaneous and flexible rather than planned and organized (Perceiving).
                    INTPs are sometimes referred to as Architect personalities because of their intuitive understanding of complex systems. Other nicknames for the INTP include:The Objective Analyst (MBTI).The Logician (16Personalities)
                    INTPs are philosophical innovators, fascinated by logical analysis, systems, and design.They want to understand the unifying themes of life. INTPs are detached, analytical observers who can seem oblivious to the world around them because they are so deeply absorbed in thought. They spend much of their time in their own heads: exploring concepts, making connections, and seeking understanding of how things work. To the Architect, life is an ongoing inquiry into the mysteries of the universe.""");
            case "ESFJ" -> System.out.println("""
                    ESFJ stands for Extraverted, Sensing, Feeling, Judging. ESFJ indicates a person who is energized by time spent with others (Extraverted), who focuses on facts and details rather than ideas and concepts (Sensing), who makes decisions based on feelings and values (Feeling) and who prefers to be planned and organized rather than spontaneous and flexible (Judging). ESFJs are sometimes referred to as Provider personalities because of their interest in taking care of others in practical ways.ESFJs are conscientious helpers, sensitive to the needs of others and energetically dedicated to their responsibilities. They are highly attuned to their emotional environment and attentive to both the feelings of others and the perception others have of them. ESFJs like a sense of harmony and cooperation around them, and are eager to please and provide
                    ESFJs value loyalty and tradition, and usually make their family and friends their top priority. They are generous with their time, effort, and emotions. They often take on the concerns of others as if they were their own, and will attempt to put their significant organizational talents to use to bring order to other people's lives.""");
            case "ESFP" -> System.out.println("""
                    ESFP stands for Extraverted, Sensing, Feeling, Perceiving. ESFP indicates a person who is energized by time spent with others (Extraverted), who focuses on facts and details rather than ideas and concepts (Sensing), who makes decisions based on feelings and values (Feeling) and who prefers to be spontaneous and flexible rather than planned and organized (Perceiving). ESFPs are sometimes referred to as Performer personalities because of their playful, energetic nature.ESFPs are vivacious entertainers who charm and engage those around them. They are spontaneous, energetic, and fun-loving, and take pleasure in the things around them: food, clothes, nature, animals, and especially people.
                    ESFPs are typically warm and talkative and have a contagious enthusiasm for life. They like to be in the middle of the action and the center of attention. They have a playful, open sense of humor, and like to draw out other people and help them have a good time.""");
            case "ISFP" -> System.out.println("""
                    ISFP stands for Introverted, Sensing, Feeling, Perceiving. ISFP indicates a person who is energized by time spent alone (Introverted), who focuses on facts and details rather than ideas and concepts (Sensing), who makes decisions based on feelings and values (Feeling) and who prefers to be spontaneous and flexible rather than planned and organized (Perceiving). ISFPs are sometimes referred to as Composer personalities because of their innate sensibility for creating aesthetically pleasing experiences.ISFPs are gentle caretakers who live in the present moment and enjoy their surroundings with cheerful, low-key enthusiasm. They are flexible and spontaneous, and like to go with the flow to enjoy what life has to offer. ISFPs are quiet and unassuming, and may be hard to get to know. However, to those who know them well, the ISFP is warm and friendly, eager to share in life's many experiences.
                    ISFPs have a strong aesthetic sense and seek out beauty in their surroundings. They are attuned to sensory experience, and often have a natural talent for the arts. ISFPs especially excel at manipulating objects, and may wield creative tools like paintbrushes and sculptor's knives with great mastery.""");
            case "ESTJ" -> System.out.println("""
                    ESTJ stands for Extraverted, Sensing, Thinking, Judging. ESTJ indicates a person who is energized by time spent with others (Extraverted), who focuses on facts and details rather than ideas and concepts (Sensing), who makes decisions based on logic and reason (Thinking) and who prefers to be planned and organized rather than spontaneous and flexible (Judging). ESTJs are sometimes referred to as Supervisor personalities because they tend to take charge and make sure things are done correctly.
                    ESTJs are hardworking traditionalists, eager to take charge in organizing projects and people. Orderly, rule-abiding, and conscientious, ESTJs like to get things done, and tend to go about projects in a systematic.
                    ESTJs are the consummate organizers, and want to bring structure to their surroundings. They value predictability and prefer things to proceed in a logical order. When they see a lack of organization, the ESTJ often takes the initiative to establish processes and guidelines, so that everyone knows what's expected.""");
            case "ESTP" -> System.out.println("""
                    ESTP stands for Extraverted, Sensing, Thinking, Perceiving. ESTP indicates a person who is energized by time spent with others (Extraverted), who focuses on facts and details rather than ideas and concepts (Sensing), who makes decisions based on logic and reason (Thinking) and who prefers to be spontaneous and flexible rather than planned and organized (Perceiving).
                     ESTPs are sometimes referred to as Dynamo personalities because of their high-energy, active approach to life. ESTPs are energetic thrill seekers who are at their best when putting out fires, whether literal or metaphorical. 
                     They bring a sense of dynamic energy to their interactions with others and the world around them. They assess situations quickly and move adeptly to respond to immediate problems with practical solutions.
                     Active and playful, ESTPs are often the life of the party and have a good sense of humor. They use their keen powers of observation to assess their audience and adapt quickly to keep interactions exciting. Although they typically appear very social, they are rarely sensitive; the ESTP prefers to keep things fast-paced and silly rather than emotional or serious.""");
            case "ISTJ" -> System.out.println("""
                    ISTJ stands for Introverted, Sensing, Thinking, Judging. ISTJ indicates a person who is energized by time spent alone (Introverted), who focuses on facts and details rather than ideas and concepts (Sensing), who makes decisions based on logic and reason (Thinking) and who prefers to be planned and organized rather than spontaneous and flexible (Judging). 
                    ISTJs are sometimes referred to as Inspector personalities because of their focus on details and interest in doing things correctly.ISTJs are responsible organizers, driven to create and enforce order within systems and institutions. They are neat and orderly, inside and out, and tend to have a procedure for everything they do. Reliable and dutiful, ISTJs want to uphold tradition and follow regulations
                    ISTJs are steady, productive contributors. Although they are Introverted, ISTJs are rarely isolated; typical ISTJs know just where they belong in life, and want to understand how they can participate in established organizations and systems. They concern themselves with maintaining the social order and making sure that standards are met.""");
            case "ISTP" -> System.out.println("""
                    ISTP stands for Introverted, Sensing, Thinking, Perceiving. ISTP indicates a person who is energized by time spent alone (Introverted), who focuses on facts and details rather than ideas and concepts (Sensing), who makes decisions based on logic and reason (Thinking) and who prefers to be spontaneous and flexible rather than planned and organized (Perceiving). ISTPs are sometimes referred to as Crafts person personalities because they typically have an innate mechanical ability and facility with tools.ISTPs are observant artisans with an understanding of mechanics and an interest in troubleshooting. 
                    They approach their environments with a flexible logic, looking for practical solutions to the problems at hand. They are independent and adaptable, and typically interact with the world around them in a self-directed, spontaneous manner.
                    ISTPs are attentive to details and responsive to the demands of the world around them. Because of their astute sense of their environment, they are good at moving quickly and responding to emergencies. ISTPs are reserved, but not withdrawn: the ISTP enjoys taking action, and approaches the world with a keen appreciation for the physical and sensory experiences it has to offer.""");
            case "ENFJ" -> System.out.println("""
                    ENFJ stands for Extraverted, iIntuitive, Feeling, Judging. ENFJ indicates a person who is energized by time spent with others (Extraverted), who focuses on ideas and concepts rather than facts and details (iNtuitive), who makes decisions based on feelings and values (Feeling) and who prefers to be planned and organized rather than spontaneous and flexible (Judging). ENFJs are sometimes referred to as Teacher personalities because of their interest in helping others develop and grow.ENFJs are idealist organizers, driven to implement their vision of what is best for humanity. 
                    They often act as catalysts for human growth because of their ability to see potential in other people and their charisma in persuading others to their ideas.
                    They are focused on values and vision, and are passionate about the possibilities for people. ENFJs are typically energetic and driven, and often have a lot on their plates. They are tuned into the needs of others and acutely aware of human suffering; however, they also tend to be optimistic and forward-thinking, intuitively seeing opportunity for improvement. The ENFJ is ambitious, but their ambition is not self-serving: rather, they feel personally responsible for making the world a better place.""");
            case "ISFJ" -> System.out.println("""
                    It stands for Introverted, Sensing, Feeling, Judging. ISFJ indicates a person who is energized by time spent alone (Introverted), who focuses on facts and details rather than ideas and concepts (Sensing), who makes decisions based on feelings and values (Feeling) and who prefers to be planned and organized rather than spontaneous and flexible (Judging). ISFJs are sometimes referred to as Protector personalities because of their interest in keeping people safe and well cared for.ISFJs are industrious caretakers, loyal to traditions and organizations.
                    "They are practical, compassionate, and caring, and are motivated to provide for others and protect them from the perils of life.
                    "ISFJs are conventional and grounded, and enjoy contributing to established structures of society. 
                    They are steady and committed workers with a deep sense of responsibility to others. They focus on fulfilling their duties, particularly when they are taking care of the needs of other people. They want others to know that they are reliable and can be trusted to do what is expected of them. They are conscientious and methodical, and persist until the job is done.""");
            default -> System.out.println();

        }
    }
}