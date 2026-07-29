package com.agentworkflow.lab.engine;

import com.agentworkflow.lab.models.Rule;
import java.util.ArrayList;
import java.util.List;

/**
 * Core Rule Engine with 50+ predefined agent rules.
 */
public class RuleEngine {
    private List<Rule> rules;

    public RuleEngine() {
        rules = new ArrayList<>();
        initializeRules();
    }

    private void initializeRules() {
        rules.add(new Rule("hungry", "User is feeling hungry", "Analyze keywords: hungry, food", "Suggest nearby food", "You should eat something healthy."));
        rules.add(new Rule("thirsty", "User is thirsty", "Analyze keywords: thirsty, water", "Suggest hydration", "Please drink some fresh water."));
        rules.add(new Rule("sleepy", "User is sleepy", "Analyze keywords: sleepy, tired", "Suggest rest", "You should take a quick power nap."));
        rules.add(new Rule("sad", "User is feeling sad", "Analyze keywords: sad, down", "Suggest music", "Listening to your favorite music might help."));
        rules.add(new Rule("happy", "User is feeling happy", "Analyze keywords: happy, joyful", "Suggest celebration", "That's great! Time to celebrate your success."));
        rules.add(new Rule("exam", "User has an exam", "Analyze keywords: exam, test", "Suggest study", "Focus and start studying now."));
        rules.add(new Rule("rain", "It is raining outside", "Analyze keywords: rain, wet", "Suggest umbrella", "Don't forget to carry an umbrella."));
        rules.add(new Rule("headache", "User has a headache", "Analyze keywords: headache, pain", "Suggest water/rest", "Drink water and rest in a dark room."));
        rules.add(new Rule("cold", "It is cold outside", "Analyze keywords: cold, winter", "Suggest jacket", "Wear a warm jacket before going out."));
        rules.add(new Rule("exercise", "User wants to exercise", "Analyze keywords: exercise, gym", "Suggest workout", "Start with a 15-minute warm-up."));
        rules.add(new Rule("late", "User is running late", "Analyze keywords: late, hurry", "Suggest speed up", "Hurry up! You need to leave now."));
        rules.add(new Rule("dark", "Room is dark", "Analyze keywords: dark, light", "Suggest lights", "Turn on the lights to see clearly."));
        rules.add(new Rule("hot", "It is very hot", "Analyze keywords: hot, heat", "Suggest AC/Fan", "Turn on the air conditioner or fan."));
        rules.add(new Rule("bored", "User is bored", "Analyze keywords: bored, free", "Suggest hobby", "Try reading a book or watching a movie."));
        rules.add(new Rule("sick", "User is feeling sick", "Analyze keywords: sick, ill", "Suggest doctor", "You should consult a doctor soon."));
        rules.add(new Rule("angry", "User is angry", "Analyze keywords: angry, mad", "Suggest meditation", "Take deep breaths and stay calm."));
        rules.add(new Rule("lost", "User is lost", "Analyze keywords: lost, map", "Suggest GPS", "Open Google Maps for navigation."));
        rules.add(new Rule("coffee", "User wants coffee", "Analyze keywords: coffee, caffeine", "Suggest cafe", "There is a coffee shop nearby."));
        rules.add(new Rule("study", "User needs to study", "Analyze keywords: study, learn", "Suggest library", "Go to the library for a quiet environment."));
        rules.add(new Rule("shopping", "User wants to shop", "Analyze keywords: shopping, buy", "Suggest mall", "The city mall is open until 9 PM."));
        
        // Adding more to reach 50+
        rules.add(new Rule("travel", "User planning travel", "Travel keywords detected", "Plan itinerary", "Start booking your tickets today."));
        rules.add(new Rule("work", "User at work", "Work keywords detected", "Focus on tasks", "Organize your tasks for the day."));
        rules.add(new Rule("music", "User wants music", "Music keywords detected", "Open player", "Playing your recent playlist now."));
        rules.add(new Rule("movie", "User wants a movie", "Movie keywords detected", "Suggest cinema", "Check the latest releases at the cinema."));
        rules.add(new Rule("game", "User wants to play", "Game keywords detected", "Open console", "Launch your favorite game."));
        rules.add(new Rule("book", "User wants to read", "Book keywords detected", "Suggest library", "Pick a bestseller from the library."));
        rules.add(new Rule("news", "User wants news", "News keywords detected", "Show headlines", "Here are the top headlines for today."));
        rules.add(new Rule("weather", "User checks weather", "Weather keywords detected", "Show forecast", "It will be sunny for the next few hours."));
        rules.add(new Rule("alarm", "User sets alarm", "Alarm keywords detected", "Set time", "Alarm is set for 7:00 AM."));
        rules.add(new Rule("reminder", "User needs reminder", "Reminder keywords detected", "Save note", "Reminder added to your calendar."));
        rules.add(new Rule("call", "User needs to call", "Call keywords detected", "Open contacts", "Dialing the requested contact now."));
        rules.add(new Rule("mail", "User needs to mail", "Mail keywords detected", "Open inbox", "Checking for new emails in your inbox."));
        rules.add(new Rule("photo", "User wants photo", "Photo keywords detected", "Open camera", "Smile! The camera is ready."));
        rules.add(new Rule("video", "User wants video", "Video keywords detected", "Open recorder", "Recording started successfully."));
        rules.add(new Rule("battery", "Battery is low", "Battery keywords detected", "Suggest charger", "Please plug in your charger now."));
        rules.add(new Rule("wifi", "No internet", "Wifi keywords detected", "Check router", "Please restart your wifi router."));
        rules.add(new Rule("blue", "User likes blue", "Color keywords detected", "Theme change", "Applied the blue theme to the UI."));
        rules.add(new Rule("clean", "Room is dirty", "Clean keywords detected", "Suggest vacuum", "Time to use the vacuum cleaner."));
        rules.add(new Rule("gift", "User needs gift", "Gift keywords detected", "Suggest store", "Check the nearby gift shop for ideas."));
        rules.add(new Rule("party", "User planning party", "Party keywords detected", "Invite friends", "Send invitations to your friend list."));
        rules.add(new Rule("meeting", "Meeting scheduled", "Meeting keywords detected", "Open calendar", "Meeting starts in 15 minutes."));
        rules.add(new Rule("drive", "User is driving", "Drive keywords detected", "Safe mode", "Safe driving mode activated."));
        rules.add(new Rule("gym", "User at gym", "Gym keywords detected", "Track steps", "Keep going! You are doing great."));
        rules.add(new Rule("run", "User running", "Run keywords detected", "Track distance", "You have covered 5 kilometers today."));
        rules.add(new Rule("walk", "User walking", "Walk keywords detected", "Track steps", "Goal: 10,000 steps for today."));
        rules.add(new Rule("debt", "User has debt", "Debt keywords detected", "Financial plan", "Consult a financial advisor for help."));
        rules.add(new Rule("save", "User wants to save", "Save keywords detected", "Investment", "Consider putting money in a savings account."));
        rules.add(new Rule("pizza", "User wants pizza", "Pizza keywords detected", "Order now", "Ordering a large cheese pizza for you."));
        rules.add(new Rule("tea", "User wants tea", "Tea keywords detected", "Make tea", "Green tea is ready in the kitchen."));
        rules.add(new Rule("fruit", "User wants fruit", "Fruit keywords detected", "Healthy snack", "Eat an apple or banana for energy."));
        rules.add(new Rule("water", "User needs water", "Water keywords detected", "Stay hydrated", "Drink at least 8 glasses of water daily."));
    }

    public Rule matchRule(String input) {
        String lowerInput = input.toLowerCase();
        for (Rule rule : rules) {
            if (lowerInput.contains(rule.getKeyword())) {
                return rule;
            }
        }
        return new Rule("unknown", "Input detected: " + input, "No specific keywords found", "Use default response", "I'm not sure how to help. Try something else.");
    }
    
    public List<Rule> getAllRules() {
        return rules;
    }
}
