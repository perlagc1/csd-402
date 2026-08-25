import random

print("Rock-Paper-Scissors Game")
print("1 = Rock, 2 = Paper, 3 = Scissors")

# Computer choice
computer = random.randint(1, 3)

# User choice
user = int(input("Enter your choice (1-3): "))

# Names for display
names = {1: "Rock", 2: "Paper", 3: "Scissors"}

print(f"\nYou chose: {names[user]}")
print(f"Computer chose: {names[computer]}")

# Determine winner
if user == computer:
    print("Result: It's a tie!")
elif (user == 1 and computer == 3) or \
     (user == 2 and computer == 1) or \
     (user == 3 and computer == 2):
    print("Result: You win!")
else:
    print("Result: Computer wins!")