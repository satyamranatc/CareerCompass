package com.compass.backend.Util;

import org.springframework.stereotype.Component;

import com.compass.backend.DTO.LearnerDetails;
import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;

@Component
public class AskAi {

    private final Client client = Client.builder()
            .apiKey("AIzaSyBQny5bBdFtSuy1TszZbZJmpbxjN3jHbyg")
            .build();

    public String askAi(LearnerDetails learnerDetails) {

        String promptToAsk = """
You are a senior Career Counsellor with 20+ years of experience.
Your task is to guide a learner towards the best possible career or hobby path.

LEARNER DETAILS:
Name: %s
Age: %d
City: %s
Country: %s
Current Subject: %s
Goal: %s

TASK:
1. Decide whether the learner’s goal should be treated as:
   - a serious long-term career
   - or a side hobby
   (based on age, subject, and goal realism)

2. Create a step-by-step ROADMAP to achieve the goal.

STRICT RULES (VERY IMPORTANT):
- The response MUST be a VALID JSON object.
- Do NOT use markdown, backticks, comments, or extra text.
- Do NOT explain anything outside JSON.
- Use DOUBLE QUOTES only (").
- All keys must be camelCase.
- Arrays must be proper JSON arrays.
- If books are not available, use null (not "null").

TONE RULES:
- Roadmap descriptions must be HUMOROUS HINGLISH (Indian English + Hindi mix).
- Friendly, motivating, but still practical and realistic.

JSON FORMAT (FOLLOW EXACTLY):

{
  "greetings": "Personalized greeting using learner name",
  "careerType": "career or hobby",
  "roadmapSteps": [
    {
      "stepTitle": "Title of the step",
      "stepDescription": "Funny Hinglish explanation of what to do",
      "stepEstimatedTime": "Number of hours or weeks",
      "bestYouTubeChannels": ["Channel 1", "Channel 2"],
      "bestBooks": ["Book 1", "Book 2"] or null,
      "output": "What learner will achieve after this step"
    }
  ]
}
""".formatted(
                learnerDetails.getName(),
                learnerDetails.getAge(),
                learnerDetails.getCity(),
                learnerDetails.getCountry(),
                learnerDetails.getSubject(),
                learnerDetails.getGoal()
        );

        GenerateContentResponse response = client.models.generateContent(
                "gemini-3-flash-preview",
                promptToAsk,
                null
        );

        return response.text();
    }
}
