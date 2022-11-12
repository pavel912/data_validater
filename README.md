### Hexlet tests and linter status:
[![Actions Status](https://github.com/pavel912/java-project-78/workflows/hexlet-check/badge.svg)](https://github.com/pavel912/java-project-78/actions)
[![Maintainability](https://api.codeclimate.com/v1/badges/d029ff04b853c0789431/maintainability)](https://codeclimate.com/github/pavel912/java-project-78/maintainability)
[![Test Coverage](https://api.codeclimate.com/v1/badges/d029ff04b853c0789431/test_coverage)](https://codeclimate.com/github/pavel912/java-project-78/test_coverage)

# Data Validator Project
This project is a small extension, that allows to check data with some conditions for each datatype.

The check is performed lazily when method isValid is called.
Since every method returns current object, methods can be called successively.

An example:

        Validator v = new Validator(); // create validator object

        StringSchema schema = v.string(); // specify string validation

        schema.isValid(""); // true
        schema.isValid(null); // true

        schema.required(); // we require string to have any value

        schema.isValid(null); // false
        schema.isValid("what does the fox say"); // true

        schema.minLength(5); // we require string to have length an least 5
        schema.isValid("what"); // false

        schema.contains("what"); // we require string to contain "what"

        isValid("what does the fox say") // true

There are 3 datatypes now:
1. Strings
   1. Not null check
   2. Minimal length check
   3. Substring containment check
2. Integers
   1. Not null check
   2. Positivity check
   3. Number is in range check
3. Maps
   1. Not null check
   2. Minimal size check
   3. Check conditions above for string and integer values inside Map

New datatypes and checks will be added soon!
