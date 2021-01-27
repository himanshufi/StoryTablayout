# StoryTablayout


## Download

### Add this in project level gradle.

```
allprojects {
   repositories {
      ...
      maven { url 'https://jitpack.io' }
   }
}
```
### Add this in app level gradle

```
implementation 'com.github.himanshufi:StoryTablayout:0.1.0'
```

## Documentation

#### In XML

```
 <com.himanshu.storytablayout.StoryTabLayout
      android:id="@+id/storyTabLayout"
      android:layout_width="match_parent"
      android:layout_height="wrap-content"
      />
	 
```

#### Tab Count

```
val storyTabLayout = findViewById<StoryTabLayout>(R.id.storyTabLayout)
storyTabLayout.setViewCount(count = 10)
```
Or in case of Data Binding / View Binding

```
binding.storyTabLayout.setViewCount(count = 10)
```


#### Tab Selection

The selected tab and all the tabs before it will appear in `White Color` and non-selected will be in `Grey Color`.

```
val storyTabLayout = findViewById<StoryTabLayout>(R.id.storyTabLayout)
storyTabLayout.setCurrentViewIndex(index = 3)
```

Or in case of Data Binding / View Binding


```
binding.storyTabLayout.setCurrentViewIndex(index = 3)
```

## Screenshots

<img src="https://user-images.githubusercontent.com/35216589/105994907-40b40080-60ce-11eb-8eab-cde544d43fac.png" width="200" height="400"/>



