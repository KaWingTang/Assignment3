package com.example.woof.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.woof.R

data class Dog(
    @DrawableRes val imageResourceId: Int,
    val day: String,
    val name: String,
    val quote: String
)

val dogs = listOf(
    Dog(R.drawable.d1, "1", "Albert Einstein", "Imagination is more important than knowledge."),
    Dog(R.drawable.d2, "2", "Maya Angelou", "Try to be a rainbow in someone's cloud."),
    Dog(R.drawable.d3, "3", "Nelson Mandela", "Education is the most powerful weapon which you can use to change the world."),
    Dog(R.drawable.d4, "4", "Oprah Winfrey", "The biggest adventure you can take is to live the life of your dreams."),
    Dog(R.drawable.d5, "5", "Steve Jobs", "Your work is going to fill a large part of your life, and the only way to be truly satisfied is to do what you believe is great work."),
    Dog(R.drawable.d6, "6", "Malala Yousafzai", "We realize the importance of our voices only when we are silenced."),
    Dog(R.drawable.d7, "7", "Mahatma Gandhi", "Be the change that you wish to see in the world."),
    Dog(R.drawable.d8, "8", "Frida Kahlo", "Feet, what do I need them for if I have wings to fly?"),
    Dog(R.drawable.d9, "9", "Martin Luther King Jr.", "Darkness cannot drive out darkness; only light can do that. Hate cannot drive out hate; only love can do that."),
    Dog(R.drawable.d10, "10", "Coco Chanel", "The most courageous act is still to think for yourself. Aloud."),
    Dog(R.drawable.d11, "11", "Leonardo da Vinci", "Simplicity is the ultimate sophistication."),
    Dog(R.drawable.d12, "12", "Rosa Parks", "I have learned over the years that when one's mind is made up, this diminishes fear."),
    Dog(R.drawable.d13, "13", "Marie Curie", "Nothing in life is to be feared, it is only to be understood."),
    Dog(R.drawable.d14, "14", "Walt Disney", "All our dreams can come true, if we have the courage to pursue them."),
    Dog(R.drawable.d15, "15", "Amelia Earhart", "The most difficult thing is the decision to act, the rest is merely tenacity."),
    Dog(R.drawable.d16, "16", "Vincent van Gogh", "I am seeking, I am striving, I am in it with all my heart."),
    Dog(R.drawable.d17, "17", "Jane Goodall", "What you do makes a difference, and you have to decide what kind of difference you want to make."),
    Dog(R.drawable.d18, "18", "Albert Schweitzer", "The purpose of human life is to serve, and to show compassion and the will to help others."),
    Dog(R.drawable.d19, "19", "Isaac Newton", "If I have seen further than others, it is by standing upon the shoulders of giants."),
    Dog(R.drawable.d20, "20", "J.K. Rowling", "It is impossible to live without failing at something, unless you live so cautiously that you might as well not have lived at all."),
    Dog(R.drawable.d21, "21", "Helen Keller", "The only thing worse than being blind is having sight but no vision."),
    Dog(R.drawable.d22, "22", "Neil Armstrong", "That's one small step for man, one giant leap for mankind."),
    Dog(R.drawable.d23, "23", "Mother Teresa", "Not all of us can do great things. But we can do small things with great love."),
    Dog(R.drawable.d24, "24", "Stephen Hawking", "Remember to look up at the stars and not down at your feet."),
    Dog(R.drawable.d25, "25", "Eleanor Roosevelt", "No one can make you feel inferior without your consent."),
    Dog(R.drawable.d26, "26", "William Shakespeare", "All the world's a stage, and all the men and women merely players."),
    Dog(R.drawable.d27, "27", "Marie Antoinette", "Let them eat cake."),
    Dog(R.drawable.d28, "28", "Nikola Tesla", "The present is theirs; the future, for which I really worked, is mine."),
    Dog(R.drawable.d29, "29", "Anne Frank", "How wonderful it is that nobody need wait a single moment before starting to improve the world."),
    Dog(R.drawable.d30, "30", "Pablo Picasso", "Every child is an artist. The problem is how to remain an artist once he grows up.")
)
