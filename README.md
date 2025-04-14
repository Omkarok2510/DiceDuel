# 🎲 Dice Duel - A Java Battle Game

![Java](https://img.shields.io/badge/Java-24%2B-blue)
![GitHub repo size](https://img.shields.io/github/repo-size/Omkarok2510/DiceDuel)
![License](https://img.shields.io/badge/License-MIT-green)

A thrilling console-based dice battle game with sound effects and ASCII-art visuals. Roll the dice and defeat your opponent!

![Dice Duel Demo](https://media4.giphy.com/media/v1.Y2lkPTc5MGI3NjExNjk1dWVjMzJndXFxOHd4YmdsOTJkeGRoaDNlMGJhd25naHB6MXhvMiZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9Zw/VGoZVlR9naOZCiRLSy/giphy.gif)


```java
// Sample of the intense battle output:
🏟️  DICE DUEL ARENA 🏟️  
YOU            vs            ENEMY

YOUR TURN
Rolling... ⚅ (You rolled 6!)

ENEMY'S TURN  
Rolling... ⚃ (Enemy rolled 4!)

⚔️ BATTLE RESULTS ⚔️
YOU: 6   vs   ENEMY: 4

╔═══════════════╗
│  YOU WIN! 🏆  │
╚═══════════════╝
```
## ✨ Features

- 🎮 **Player vs Player** dice rolling combat
- 🔊 **Sound effects** for immersive gameplay
- 📊 **Instant results** 
- 🏆 **Winner declaration** with emoji celebrations

## 🚀 How to Run

### Requirements
- Java 24 or later
- Terminal with ANSI color support

```bash
# Compile
javac -d bin src/*.java src/model/*.java src/controller/*.java src/ui/*.java

# Run
java -cp bin src.Main
