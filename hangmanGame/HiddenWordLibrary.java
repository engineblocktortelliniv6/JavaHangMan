public class HiddenWordLibrary {
    
    private final String[] easyWords = {"cat", "dog", "sun", "hat", "fish", "tree", "milk", "book", "apple", "bread",
    "chair", "house", "green", "water", "pizza", "tiger", "beach", "happy", "robot", "garden",
    "school", "window", "button", "cookie", "yellow", "orange", "planet", "rocket", "winter", "summer",
    "monkey", "camera", "pencil", "flower", "dragon", "basket", "guitar", "kitten", "bottle", "soccer",
    "castle", "pirate", "dinner", "jungle", "farmer", "rabbit", "ladder", "napkin", "pillow", "vacuum",
    "artist", "candle", "desert", "forest", "hammer", "island", "jacket", "kitchen", "magnet", "notebook",
    "ocean", "painter", "quilt", "rainbow", "sandwich", "teacher", "umpire", "village", "wallet", "xylophone",
    "yogurt", "zebra", "airport", "battery", "captain", "diamond", "elephant", "festival", "glasses", "hospital",
    "icecream", "jewelry", "kangaroo", "library", "mountain", "newspaper", "octopus", "penguin", "question", "restaurant",
    "snowman", "telephone", "umbrella", "volcano", "whistle", "backpack", "computer", "firetruck", "hamburger", "playground"};
    
    private final String[] mediumWords = {
    "absolute", "adventure", "airplane", "alligator", "apartment", "astronaut", "backwards", "baseball", "birthday", "blueberry",
    "breakfast", "butterfly", "campfire", "champion", "chocolate", "classroom", "dangerous", "daughter", "dinosaur", "discovery",
    "earthquake", "electric", "engineer", "exercise", "fireworks", "football", "friendship", "furniture", "galaxy", "generation",
    "hamburger", "headphones", "helicopter", "important", "internet", "jellyfish", "kangaroo", "knowledge", "landscape", "language",
    "lightning", "marshmallow", "microwave", "motorcycle", "neighborhood", "newspaper", "notebook", "occupation", "orchestra", "painting",
    "passenger", "pineapple", "playground", "population", "president", "rainforest", "refrigerator", "restaurant", "sandcastle", "scientist",
    "shopping", "skateboard", "snowstorm", "spaceship", "spaghetti", "squirrel", "strawberry", "sunflower", "superhero", "telephone",
    "television", "thermometer", "thunderstorm", "toothbrush", "tournament", "treasure", "triangle", "umbrella", "university", "vacation",
    "vegetable", "volleyball", "waterfall", "wheelchair", "wilderness", "wonderful", "workplace", "wristwatch", "xylophone", "yesterday",
    "zookeeper", "basketball", "calculator", "friendship", "grandfather", "headlights", "imagination", "journalist", "kindergarten", "lighthouse"};
    
    private final String[] hardWords = {"awkward", "bagpipes", "banjo", "bungalow", "croquet", "crypt", "cycle", "dwarves", "espionage", "fishhook",
    "gazebo", "glyph", "gnarly", "haiku", "haphazard", "icebox", "ivory", "jazzy", "jukebox", "kayak",
    "kiwifruit", "lengths", "luxury", "matrix", "microwave", "mystify", "nightclub", "onyx", "oxygen", "pajama",
    "pixel", "pneumonia", "polka", "quadruple", "quartz", "queue", "rhythm", "scratch", "strength", "subway",
    "syndrome", "transcript", "unknown", "vaporize", "vixen", "vodka", "voodoo", "walkway", "waltz", "waveform",
    "whiskey", "wizard", "wristwatch", "xylophone", "yachtsman", "yippee", "zigzag", "zodiac", "zombie", "abruptly",
    "absurd", "avenue", "blizzard", "buffalo", "buzzing", "cobweb", "cockiness", "cryptic", "curacao", "dizzying",
    "duplex", "embezzle", "equip", "exodus", "faking", "flopping", "foxglove", "frazzled", "funny", "galvanize",
    "gazette", "gossip", "grogginess", "injury", "jackpot", "jigsaw", "jinx", "jiujitsu", "keyhole", "larynx",
    "luxurious", "mnemonic", "nightmare", "oxidize", "peekaboo", "pharaoh", "pixelated", "puzzling", "quip", "sphinx"};


    public String getWord(int pos, int difficulty) {
        
        if (difficulty == 1) {
            return easyWords[pos];
        }

        else if (difficulty == 2) {
            return mediumWords[pos];
        }

        else if (difficulty == 3) {
            return hardWords[pos];
        }

        else {
            return "Error, invalid difficulty level.";
        }
    }
    }
