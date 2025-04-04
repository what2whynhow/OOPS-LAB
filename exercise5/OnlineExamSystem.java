// Base class for Exam
class Exam {
    String subject;
    int duration; // in minutes

    // Default constructor
    Exam(String subject, int duration) {
        this.subject = subject;
        this.duration = duration;
    }

    void startExam() {
        System.out.println("Starting " + subject + " exam. Duration: " + duration + " minutes.");
    }
}

// Objective Exam (MCQs)
class ObjectiveExam extends Exam {
    int numQuestions;

    ObjectiveExam(String subject, int duration, int numQuestions) {
        super(subject, duration);
        this.numQuestions = numQuestions;
    }

    @Override
    void startExam() {
        System.out.println("Starting Objective Exam: " + subject + ". Duration: " + duration + " minutes. Number of Questions: " + numQuestions);
    }
}

// Subjective Exam (Written answers)
class SubjectiveExam extends Exam {
    boolean essayRequired;

    SubjectiveExam(String subject, int duration, boolean essayRequired) {
        super(subject, duration);
        this.essayRequired = essayRequired;
    }

    @Override
    void startExam() {
        System.out.println("Starting Subjective Exam: " + subject + ". Duration: " + duration + " minutes. Essay Required: " + (essayRequired ? "Yes" : "No"));
    }
}

// Coding Exam
class CodingExam extends Exam {
    String programmingLanguage;
    int numProblems;

    CodingExam(String subject, int duration, String programmingLanguage, int numProblems) {
        super(subject, duration);
        this.programmingLanguage = programmingLanguage;
        this.numProblems = numProblems;
    }

    @Override
    void startExam() {
        System.out.println("Starting Coding Exam in " + programmingLanguage + ". Subject: " + subject + ". Duration: " + duration + " minutes. Number of Problems: " + numProblems);
    }
}

// Main class to test the exams
public class OnlineExamSystem {
    public static void main(String[] args) {
        Exam e1 = new ObjectiveExam("Math", 60, 40);
        Exam e2 = new SubjectiveExam("History", 90, true);
        Exam e3 = new CodingExam("Programming", 120, "Java", 5);

        e1.startExam();
        e2.startExam();
        e3.startExam();
    }
}
