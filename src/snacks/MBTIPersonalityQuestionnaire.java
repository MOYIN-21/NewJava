package snacks;
import java.util.Scanner;

    public class MBTIPersonalityQuestionnaire {
        private static final Scanner keyboard = new Scanner(System.in);
        private static final String[] eiResponses = new String[6];
        private static int eiAResponses;
        private static int eiBResponses;
        private static final String[] snResponses = new String[5];
        private static int snAResponses;
        private static int snBResponses;
        private static final String[] tfResponses = new String[5];
        private static int tfAResponses;
        private static int tfBResponses;
        private static final String[] jpResponses = new String[5];
        private static int jpAResponses;
        private static int jpBResponses;

        public static void main(String[] args) {
            firstQuestion();
            secondQuestion();
            thirdQuestion();
            fourthQuestion();
            fifthQuestion();
            sixthQuestion();
            seventhQuestion();
            eighthQuestion();
            ninthQuestion();
            tenthQuestion();
            eleventhQuestion();
            twelfthQuestion();
            thirteenthQuestion();
            fourteenthQuestion();
            fifteenthQuestion();
            sixteenthQuestion();
            seventeenthQuestion();
            eighteenthQuestion();
            nineteenthQuestion();
            twentiethQuestion();
            extrovertedEVsIntrovertedI();
            sensingSVsIntuitiveI();
            thinkingTVsFeeling();
            judgingJVsPerspective();
            typesOfPersonalities();


        }

        public static void firstQuestion() {
            System.out.println("What's your name?");
            String name = keyboard.nextLine();
            if (name.matches("^[a-zA-Z]+$")) {
            }
            else {
                System.out.println("Sorry, the input you entered is invalid. Kindly retry.");
                firstQuestion();
            }
            eiResponses[0] = name;
            System.out.println("1. A. Expend energy, enjoy groups.\t\t\t B. Conserve energy, one-on-one");
            String response = keyboard.nextLine();
            eiResponses[0] = "Dear " + name + ", you chose";
            if (response.equalsIgnoreCase("A")) {
                eiResponses[1] = "A. Expend energy, enjoy groups.";
                eiAResponses++;
            } else if (response.equalsIgnoreCase("B")) {
                eiResponses[1] = "B. Conserve energy, one-on-one";
                eiBResponses++;
            } else {
                System.out.println("I know this is an error. Please retry again");
                firstQuestion();
            }
        }
        public static void secondQuestion() {
            System.out.println("2. A. Interpret literally. \t\t\t B. Look for meaning and possibilities.");
            String response = keyboard.nextLine();
            if (response.equalsIgnoreCase("A")) {
                snResponses[0] = "A. Interpret literally.";
                snAResponses++;
            } else if (response.equalsIgnoreCase("B")) {
                snResponses[0] = "B. Look for meaning and possibilities.";
                snBResponses++;
            } else {
                System.out.println("I know this is an error. Please retry again.");
                secondQuestion();
            }
        }

        public static void thirdQuestion() {
            System.out.println("3. A. Logical, thinking, questioning. \t\t\t B. Empathetic, feeling, accommodating");
            String response = keyboard.nextLine();
            if (response.equalsIgnoreCase("A")) {
                tfResponses[0] = "A.  Logical, thinking, questioning.";
                tfAResponses++;
            } else if (response.equalsIgnoreCase("B")) {
                tfResponses[0] = "B. Empathetic, feeling, accommodating.";
                tfBResponses++;
            } else {
                System.out.println("I know this is an error. Please retry again.");
                thirdQuestion();
            }
        }

        public static void fourthQuestion() {
            System.out.println("4. A. Organized, orderly. \t\t\t B. Flexible, adaptable");
            String response = keyboard.nextLine();
            if (response.equalsIgnoreCase("A")) {
                jpResponses[0] = "A. Organized, orderly.";
                jpAResponses++;
            } else if (response.equalsIgnoreCase("B")) {
                jpResponses[0] = "B. Flexible, adaptable.";
                jpBResponses++;
            } else {
                System.out.println("I know this is an error. Please retry again.");
                fourthQuestion();
            }
        }

        public static void fifthQuestion() {
            System.out.println("5. A. More outgoing, think out loud. \t\t\t B. More reserved, think to yourself.");
            String response = keyboard.nextLine();
            if (response.equalsIgnoreCase("A")) {
                eiResponses[2] = "A.  More outgoing, think out loud.";
                eiAResponses++;
            } else if (response.equalsIgnoreCase("B")) {
                eiResponses[2] = "B.More reserved, think to yourself.";
                eiBResponses++;
            } else {
                System.out.println("I know this is an error. Please retry again.");
                fifthQuestion();
            }

        }

        public static void sixthQuestion() {
            System.out.println("6. A. Practical, realistic, experiential. \t\t\t B. Imagination, innovative, theoretical.");
            String response = keyboard.nextLine();
            if (response.equalsIgnoreCase("A")) {
                snResponses[1] = "A. Practical, realistic, experiential.";
                snAResponses++;
            } else if (response.equalsIgnoreCase("B")) {
                snResponses[1] = "B. Imagination, innovative, theoretical.";
                snBResponses++;
            } else {
                System.out.println("I know this is an error. Please retry again.");
                sixthQuestion();
            }
        }

        public static void seventhQuestion() {
            System.out.println("7. A. Candid, straight forward, frank. \t\t\t B. Tactful, kind, encouraging.");
            String response = keyboard.nextLine();
            if (response.equalsIgnoreCase("A")) {
                tfResponses[1] = "A. Candid, straight forward, frank.";
                tfAResponses++;
            } else if (response.equalsIgnoreCase("B")) {
                tfResponses[1] = "B. Tactful, kind, encouraging.";
                tfBResponses++;
            } else {
                System.out.println("I know this is an error. Please retry again.");
                seventhQuestion();
            }
        }

        public static void eighthQuestion() {
            System.out.println("8. A. Plan, schedule. \t\t\t B. Unplanned, spontaneous");
            String response = keyboard.nextLine();
            if (response.equalsIgnoreCase("A")) {
                jpResponses[1] = "A.  Plan, schedule. ";
                jpAResponses++;
            } else if (response.equalsIgnoreCase("B")) {
                jpResponses[1] = "B. Unplanned, spontaneous.";
                jpBResponses++;
            } else {
                System.out.println("I know this is an error. Please retry again.");
                eighthQuestion();
            }
        }

        public static void ninthQuestion() {
            System.out.println("9. A. Seek many tasks, public activities, interaction with others. \t\t\t B. Seek private, " +
                    "solitary activities with quiet to concentrate.");
            String response = keyboard.nextLine();
            if (response.equalsIgnoreCase("A")) {
                eiResponses[3] = "A. Seek many tasks, public activities, interaction with others.  ";
                eiAResponses++;
            } else if (response.equalsIgnoreCase("B")) {
                eiResponses[3] = "B. Seek private, solitary activities with quiet to concentrate.";
                eiBResponses++;
            } else {
                System.out.println("I know this is an error. Please retry again.");
                ninthQuestion();
            }
        }

        public static void tenthQuestion() {
            System.out.println("10. A. Standard, usual, conventional. \t\t\t B. Different, novel, unique.");
            String response = keyboard.nextLine();
            if (response.equalsIgnoreCase("A")) {
                snResponses[2] = "A. Standard, usual, conventional.";
                snAResponses++;
            } else if (response.equalsIgnoreCase("B")) {
                snResponses[2] = "B. Different, novel, unique.";
                snBResponses++;
            } else {
                System.out.println("I know this is an error. Please retry again.");
                tenthQuestion();
            }
        }

        public static void eleventhQuestion() {
            System.out.println("11. A. Firm, tend to criticize, hold the line. \t\t\t B. Gentle, tend to appreciate, conciliate.");
            String response = keyboard.nextLine();
            if (response.equalsIgnoreCase("A")) {
                tfResponses[2] = "A. Firm, tend to criticize, hold the line.";
                tfAResponses++;
            } else if (response.equalsIgnoreCase("B")) {
                tfResponses[2] = "B. Gentle, tend to appreciate, conciliate.";
                tfBResponses++;
            } else {
                System.out.println("I know this is an error. Please retry again.");
                eleventhQuestion();
            }
        }

        public static void twelfthQuestion() {
            System.out.println("12. A. Regulated, structured. \t\t\t B. Easygoing, live  and let live.");
            String response = keyboard.nextLine();
            if (response.equalsIgnoreCase("A")) {
                jpResponses[2] = "A. Regulated, structured.";
                jpAResponses++;
            } else if (response.equalsIgnoreCase("B")) {
                jpResponses[2] = "B. Easygoing, live  and let live.";
                jpBResponses++;
            } else {
                System.out.println("I know this is an error. Please retry again.");
                twelfthQuestion();
            }
        }

        public static void thirteenthQuestion() {
            System.out.println("13. A. External, communicative, express yourself. \t\t\t B. Internal, reticent, keep to yourself.");
            String response = keyboard.nextLine();
            if (response.equalsIgnoreCase("A")) {
                eiResponses[4] = "A. External, communicative, express yourself.";
                eiAResponses++;
            } else if (response.equalsIgnoreCase("B")) {
                eiResponses[4] = "B. Internal, reticent, keep to yourself.";
                eiBResponses++;
            } else {
                System.out.println("I know this is an error. Please retry again.");
                thirteenthQuestion();
            }
        }

        public static void fourteenthQuestion() {
            System.out.println("14. A. Focus on here-and-now. \t\t\t B. Look to the future, global perspective, big picture.");
            String response = keyboard.nextLine();
            if (response.equalsIgnoreCase("A")) {
                snResponses[3] = "A. Focus on here-and-now.";
                snAResponses++;
            } else if (response.equalsIgnoreCase("B")) {
                snResponses[3] = "B. Look to the future, global perspective, big picture.";
                snBResponses++;
            } else {
                System.out.println("I know this is an error. Please retry again.");
                fourteenthQuestion();
            }
        }

        public static void fifteenthQuestion() {
            System.out.println("15. A. Tough minded, just. \t\t\t B. Tender-hearted, merciful.");
            String response = keyboard.nextLine();
            if (response.equalsIgnoreCase("A")) {
                tfResponses[3] = "A. Tough minded, just.";
                tfAResponses++;
            } else if (response.equalsIgnoreCase("B")) {
                tfResponses[3] = "B. Tender-hearted, merciful.";
                tfBResponses++;
            } else {
                System.out.println("I know this is an error. Please retry again.");
                fifthQuestion();
            }
        }

        public static void sixteenthQuestion() {
            System.out.println("16. A. Preparation, plan ahead. \t\t\t B. Go with the flow, adapt as you go.");
            String response = keyboard.nextLine();
            if (response.equalsIgnoreCase("A")) {
                jpResponses[3] = "A. Preparation, plan ahead.";
                jpAResponses++;
            } else if (response.equalsIgnoreCase("B")) {
                jpResponses[3] = "B. Go with the flow, adapt as you go.";
                jpBResponses++;
            } else {
                System.out.println("I know this is an error. Please retry again.");
                sixteenthQuestion();
            }
        }

        public static void seventeenthQuestion() {
            System.out.println("17. A. Active, initiate.  \t\t\t  B. Reflective, deliberate.");
            String response = keyboard.nextLine();
            if (response.equalsIgnoreCase("A")) {
                eiResponses[5] = "A. Active, initiate.";
                eiAResponses++;
            } else if (response.equalsIgnoreCase("B")) {
                eiResponses[5] = "B. Reflective, deliberate.";
                eiBResponses++;
            } else {
                System.out.println("I know this is an error. Please retry again.");
                seventeenthQuestion();
            }
        }

        public static void eighteenthQuestion() {
            System.out.println("18. A. Facts, things, what is. \t\t\t B. Ideas, dreams, 'what could be', philosophical.");
            String response = keyboard.nextLine();
            if (response.equalsIgnoreCase("A")) {
                snResponses[4] = "A. Facts, things, what is.";
                snAResponses++;
            } else if (response.equalsIgnoreCase("B")) {
                snResponses[4] = "B. Ideas, dreams, 'what could be', philosophical.";
                snBResponses++;
            } else {
                System.out.println("I know this is an error. Please retry again.");
                eighteenthQuestion();
            }
        }

        public static void nineteenthQuestion() {
            System.out.println("19. A. Matter of fact, issue oriented. \t\t\t B. Sensitive, people-oriented, compassionate.");
            String response = keyboard.nextLine();
            if (response.equalsIgnoreCase("A")) {
                tfResponses[4] = "A. Matter of fact, issue oriented.";
                tfAResponses++;
            } else if (response.equalsIgnoreCase("B")) {
                tfResponses[4] = "B. Sensitive, people-oriented, compassionate.";
                tfBResponses++;
            } else {
                System.out.println("I know this is an error. Please retry again.");
                nineteenthQuestion();
            }
        }

        public static void twentiethQuestion() {
            System.out.println("20. A. Control, govern. \t\t\t B. Latitude, freedom.");
            String response = keyboard.nextLine();
            if (response.equalsIgnoreCase("A")) {
                jpResponses[4] = "A. Control, govern.";
                jpAResponses++;
            } else if (response.equalsIgnoreCase("B")) {
                jpResponses[4] = "B. Latitude, freedom.";
                jpBResponses++;
            } else {
                System.out.println("I know this is an error. Please retry again.");
                twentiethQuestion();
            }
        }

        public static void extrovertedEVsIntrovertedI() {
            for (int row = 0; row < eiResponses.length; row++) {
                System.out.println(eiResponses[row]);

            }
            System.out.println("Choice A is selected " + eiAResponses + " time(s)");
            System.out.println("Choice B is selected " + eiBResponses + " time(s)");

        }

        public static void sensingSVsIntuitiveI() {
            for (int row = 0; row < snResponses.length; row++) {
                System.out.println(snResponses[row]);

            }
            System.out.println("Choice A is selected " + snAResponses + " time(s)");
            System.out.println("Choice B is selected " + snBResponses + " time(s)");

        }

        public static void thinkingTVsFeeling() {
            for (int row = 0; row < tfResponses.length; row++) {
                System.out.println(tfResponses[row]);

            }
            System.out.println("Choice A is selected " + tfAResponses + " time(s)");
            System.out.println("Choice B is selected " + tfBResponses + " time(s)");

        }

        public static void judgingJVsPerspective() {
            for (int row = 0; row < jpResponses.length; row++) {
                System.out.println(jpResponses[row]);

            }
            System.out.println("Choice A is selected " + jpAResponses + " time(s)");
            System.out.println("Choice B is selected " + jpBResponses + " time(s)");

        }

        public static void typesOfPersonalities() {
            String personality = "";
            if (eiAResponses > eiBResponses) {
                personality = personality + "E";
            } else {
                personality = personality + "I";
            }
            if (snAResponses > snBResponses) {
                personality = personality +"S";
            } else {
                personality = personality + "N";
            }
            if (tfAResponses > tfBResponses) {
                personality = personality + "T";
            } else {
                personality = personality + "F";
            }
            if (jpAResponses > jpBResponses) {
                personality = personality + "J";
            } else {
                personality = personality + "P";
            }
            System.out.println("Your type of personality can be represented as " + personality);

            switch (personality) {
                case "INFP" -> System.out.println("A Mediator (INFP) is someone who possesses the Introverted, Intuitive, \n" +
                        "Feeling, and Prospecting personality traits. These rare personality types tend to be quiet, \n" +
                        "open-minded, and imaginative, and they apply a caring and creative approach to everything they do.");
                case "INTJ" -> System.out.println("An Architect (INTJ) is a person with the Introverted, Intuitive, \n" +
                        "Thinking, and Judging personality traits. These thoughtful tacticians love perfecting the \n" +
                        "details of life, applying creativity and rationality to everything they do. Their inner world \n" +
                        "is often a private, complex one.");
                case "INTP" ->
                        System.out.println("A Logician (INTP) is someone with the Introverted, Intuitive, Thinking, and \nProspecting " +
                                "personality traits. These flexible thinkers enjoy taking an unconventional approach to many \n" +
                                "aspects of life. They often seek out unlikely paths, mixing willingness to experiment with \n" +
                                "personal creativity.");
                case "ENTJ" ->
                        System.out.println("A Commander (ENTJ) is someone with the Extraverted, Intuitive, Thinking, and \nJudging " +
                                "personality traits. They are decisive people who love momentum and accomplishment. They \ngather " +
                                "information to construct their creative visions but rarely hesitate for long before acting \non " +
                                "them.");
                case "ENTP" ->
                        System.out.println("A Debater (ENTP) is a person with the Extraverted, Intuitive, Thinking, and \n" +
                                "Prospecting personality traits. They tend to be bold and creative, deconstructing and \n" +
                                "rebuilding ideas with great mental agility. They pursue their goals vigorously despite \nany " +
                                "resistance they might encounter.");
                case "INFJ" ->
                        System.out.println("An Advocate (INFJ) is someone with the Introverted, Intuitive, Feeling, and \nJudging " +
                                "personality traits. They tend to approach life with deep thoughtfulness and imagination. \n" +
                                "Their inner vision, personal values, and a quiet, principled version of humanism guide \nthem in " +
                                "all things.");
                case "ENFJ" -> System.out.println("A Protagonist (ENFJ) is a person with the Extraverted, Intuitive, \n" +
                        "Feeling, and Judging personality traits. These warm, forthright types love helping others, and \n" +
                        "they tend to have strong ideas and values. They back their perspective with the creative energy \n" +
                        "to achieve their goals.");
                case "ENFP" -> System.out.println("A Campaigner (ENFP) is someone with the Extraverted, Intuitive, Feeling, \n" +
                        "and Prospecting personality traits. These people tend to embrace big ideas and actions that \n" +
                        "reflect their sense of hope and goodwill toward others. Their vibrant energy can flow in many \n" +
                        "directions.");
                case "ISTJ" -> System.out.println("A Logistician (ISTJ) is someone with the Introverted, Observant, \n" +
                        "Thinking, and Judging personality traits. These people tend to be reserved yet willful, with a \n" +
                        "rational outlook on life. They compose their actions carefully and carry them out with methodical \n" +
                        "purpose.");
                case "ISFJ" -> System.out.println("A Defender (ISFJ) is someone with the Introverted, Observant, Feeling, \n" +
                        "and Judging personality traits. These people tend to be warm and unassuming in their own steady way." +
                        " \nThey’re efficient and responsible, giving careful attention to practical details in their daily \n" +
                        "lives.");
                case "ESTJ" -> System.out.println("An Executive (ESTJ) is someone with the Extraverted, Observant, \n" +
                        "Thinking, and Judging personality traits. They possess great fortitude, emphatically following \n" +
                        "their own sensible judgment. They often serve as a stabilizing force among others, able to offer \n" +
                        "solid direction amid adversity.");
                case "ESFJ" -> System.out.println("A Consul (ESFJ) is a person with the Extraverted, Observant, Feeling, \n" +
                        "and Judging personality traits. They are attentive and people-focused, and they enjoy taking part \n" +
                        "in their social community. Their achievements are guided by decisive values, and they willingly \n" +
                        "offer guidance to others.");
                case "ISTP" -> System.out.println("A Virtuoso (ISTP) is someone with the Introverted, Observant, Thinking, \n" +
                        "and Prospecting personality traits. They tend to have an individualistic mindset, pursuing goals \n" +
                        "without needing much external connection. They engage in life with inquisitiveness and personal \n" +
                        "skill, varying their approach as needed.");
                case "ISFP" -> System.out.println("An Adventurer (ISFP) is a person with the Introverted, Observant, \n" +
                        "Feeling, and Prospecting personality traits. They tend to have open minds, approaching life, \n" +
                        "new experiences, and people with grounded warmth. Their ability to stay in the moment helps them \n" +
                        "uncover exciting potentials.");
                case "ESTP" -> System.out.println("An Entrepreneur (ESTP) is someone with the Extraverted, Observant, \n" +
                        "Thinking, and Prospecting personality traits. They tend to be energetic and action-oriented, \n" +
                        "deftly navigating whatever is in front of them. They love uncovering life’s opportunities, \n" +
                        "whether socializing with others or in more personal pursuits.");
                case "ESFP" -> System.out.println("An Entertainer (ESFP) is a person with the Extraverted, Observant, \n" +
                        "Feeling, and Prospecting personality traits. These people love vibrant experiences, engaging in \n" +
                        "life eagerly and taking pleasure in discovering the unknown. They can be very social, often \n" +
                        "encouraging others into shared activities.");
                default -> System.out.println();
            }
        }
    }

