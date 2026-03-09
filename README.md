# Sony Coding Challenge – Task 1

This project implements the **Observer Design Pattern** in Java to simulate a production line where machines notify employees when their state changes.

## Overview

Machines act as **subjects**, and employees act as **observers**.  
Employees register interest in machines, and whenever a machine changes its state, all attached employees are notified.

## Machine States

Machines can be in one of three states:

- PRODUCING – the machine is working
- IDLE – the machine is waiting for work
- STARVED – no material is available

## How It Works

1. Machines are created.
2. Employees subscribe to machines using the `attach()` method.
3. When a machine changes state, it notifies all observers.
4. Employees receive the update and print the information to the console.

## Example Output

Employee Name: John | Role: Technician | Machine: Machine A | Updated State: PRODUCING

## How to Run

1. Open the project.
2. Run `Main.java`.
3. Machine state changes will be printed in the console.

## Author

Tanvir Ahmed
