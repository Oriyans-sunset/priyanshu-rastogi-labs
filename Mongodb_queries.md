🔍 Basic Retrieval

Q1. Display all documents in the restaurants collection.

**Answer: db\["restaurents"].find()**



Q2. Display only restaurant\_id, name, borough, and cuisine for all restaurants.

**Answer: db\["restaurents"].find({}, {**restaurant\_id**: 1, name: 1, borough: 1, cuisine: 1})**



Q3. Same as above, but exclude \_id from the results.

**Answer: db\["restaurents"].find({}, {\_id: 0})**



Q4. Display restaurant\_id, name, borough, and zipcode — again without \_id.

**Answer: db\["restaurents"].find({}, {name: 1, borough: 1, restaurant\_id: 1, address.zipcode: 1, \_id: 0})**



📍 Filtering by Location \& Borough

Q5. Find all restaurants located in the Bronx.

Answer: d**b.restaurents.find({borough: "Bronx"})**



Q6. Show only the first 5 restaurants in the Bronx.

Answer: d**b.restaurents.find({borough: "Bronx"})**.limit(5)



Q7. Skip the first 5 Bronx restaurants and show the next 5.

Answer: d**b.restaurents.find({borough: "Bronx"}).limit(5).skip(5)**





Q10. Find restaurants with a latitude value less than -95.754168.

Answer: db.restaurents.find({"address.coord.1": { $lt: -95.754168 }})



🏆 Score-Based Filtering

Q8. Find restaurants that achieved a score greater than 90.

Answer: db.restaurents.find({"grades.score": {$gt: 90 }})



Q9. Find restaurants with a score between 80 and 100 (exclusive).

Answer: db.restaurents.find({"grades.score": {$gt: 80, $lt: 100}})



Q20. Find restaurant\_id, name, borough, and cuisine for restaurants with a score not more than 10.

Answer: db.restaurents.find({ "grades.score": { $lte: 10 } },  { restaurant\_id: 1, name: 1, borough: 1, cuisine: 1, \_id: 0})



Q30. Find restaurant\_id, name, and grades for restaurants where the score is divisible by 7 (remainder = 0).

Answer: db.restaurents.find({ grades: {$elemMatch: { score: { $mod: \[7, 0] }}}}, { restaurant\_id: 1, name: 1, grades: 1, \_id: 0})





🌍 Geo + Cuisine Filtering

Q11. Find restaurants that:

Do not serve American cuisine

Have a score greater than 70

Are located at a latitude less than -65.754168



Answer: db.restaurents.find({ cuisine: { $ne: "American" },  grades: { $elemMatch: { score: { $gt: 70 }}}, "address.coord.1": { $lt: -65.754168 }})



Q12. Same as Q11, but without using the $and operator.





Q17. Find restaurants in the Bronx that serve either American or Chinese cuisine.

Amswer: db.restaurents.find({borough: "Bronx",  cuisine: { $in: \["American", "Chinese"] }})





🗺️ Borough Filtering

Q18. Display restaurant\_id, name, borough, and cuisine for restaurants in Staten Island, Queens, Bronx, or Brooklyn.

Answer: db.restaurents.find({ borough: { $in: \["Staten Island", "Queens", "Bronx", "Brooklyn"] } },  { restaurant\_id: 1, name: 1, borough: 1, cuisine: 1, \_id: 0 })





Q19. Display the same fields for restaurants not in those four boroughs.

Answer: db.restaurents.find({ borough: { $nin: \["Staten Island", "Queens", "Bronx", "Brooklyn"] } },  { restaurant\_id: 1, name: 1, borough: 1, cuisine: 1, \_id: 0 })





🔤 Name Pattern Matching (Regex)

Q14. Find restaurant\_id, name, borough, and cuisine for restaurants whose name starts with 'Wil'.

Answer: db.restaurents.find({ name: { $regex: "^Wil" } },  { restaurant\_id: 1, name: 1, borough: 1, cuisine: 1, \_id: 0 })





Q15. Same fields for restaurants whose name ends with 'ces'.

Answer: db.restaurents.find({ name: { $regex: "ces$" } },  { restaurant\_id: 1, name: 1, borough: 1, cuisine: 1, \_id: 0 })



Q16. Same fields for restaurants whose name contains 'Reg' anywhere.

Answer: db.restaurents.find({ name: { $regex: "Reg" } },  { restaurant\_id: 1, name: 1, borough: 1, cuisine: 1, \_id: 0 })





Q31. Find name, borough, longitude, latitude, and cuisine for restaurants with 'mon' anywhere in the name.

Answer: db.restaurents.find({ name: { $regex: "mon" } },  { name: 1, borough: 1,"address.coord.0": 1, "address.coord.1": 1, cuisine: 1, \_id: 0})





Q32. Same fields for restaurants whose name begins with 'Mad'.

Answer:  db.restaurents.find({ name: { $regex: "^mad" } },  { name: 1, borough: 1,"address.coord.0": 1, "address.coord.1": 1, cuisine: 1, \_id: 0})



🎯 Combined \& Complex Conditions

Q13. Find restaurants that:



Do not serve American cuisine

Have a grade of 'A'

Are not in Brooklyn

Sort results by cuisine in descending order.

Answer: db.restaurants.find({  "cuisine": { $ne: "American " },  "grades.grade": "A",  "borough": { $ne: "Brooklyn" }}).sort({ "cuisine": -1 })



Q21. Find restaurant\_id, name, borough, and cuisine for restaurants that:



Serve neither American nor Chinese cuisine, OR

Have a name starting with 'Wil'

Answer: db.restaurants.find({ $or: \[ { "cuisine": { $nin: \["American ", "Chinese"] } }, { "name": "^Wil" }]  },  { "restaurant\_id": 1, "name": 1, "borough": 1, "cuisine": 1, "\_id": 0 })





📅 Array \& Date Queries

Q22. Find restaurant\_id, name, and grades for restaurants that received:



Grade "A"

Score 11

On 2014-08-11T00:00:00Z

Answer: db.restaurants.find( { "grades": { $elemMatch: { "grade": "A", "score": 11, "date": ISODate("2014-08-11T00:00:00Z") } } }, { "restaurant\_id": 1, "name": 1, "grades": 1, "\_id": 0 } )





Q23. Find restaurant\_id, name, and grades where the 2nd element of the grades array has:



Grade "A"

Score 9

Date 2014-08-11T00:00:00Z

Answer: db.restaurants.find( { "grades.1.grade": "A", "grades.1.score": 9, "grades.1.date": ISODate("2014-08-11T00:00:00Z") }, { "restaurant\_id": 1, "name": 1, "grades": 1, "\_id": 0 } )



Q24. Find restaurant\_id, name, address, and geo-location for restaurants where the 2nd element of the coord array is more than 42 and up to 52.

Answer: db.restaurants.find( { "address.coord.1": { $gt: 42, $lte: 52 } }, { "restaurant\_id": 1, "name": 1, "address": 1, "\_id": 0 } )



📊 Sorting

Q25. List all restaurants sorted by name ascending.

Answer: db.restaurants.find().sort({ "name": 1 })



Q26. List all restaurants sorted by name descending.

Answer: db.restaurants.find().sort({ "name": 1 })



Q27. Sort by cuisine ascending, and within the same cuisine sort by borough descending.

Answer: db.restaurants.find().sort({ "cuisine": 1,  "borough": -1})



🛠️ Miscellaneous

Q28. Check whether all address documents contain a street field.

Answer: db.restaurants.find({ "address.street": { $exists: false } })



Q29. Select all documents where the coord field value is of type Double.

Answer: db.restaurants.find({ "address.coord": { $type: "double" } })

